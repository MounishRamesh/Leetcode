class Solution {
    public int getKth(int lo, int hi, int k) {
        int[] arr2 = new int[hi-lo+1] ;
        int[] arr1 = new int[hi-lo+1] ;

        int j = 0; 
        for(int i = lo ; i <= hi ; i ++){
            int val = powerval(i) ;
            arr1[j] = i ;
            arr2[j] = val ;
            j ++ ;
        }
        for(int i = 0 ;i < arr1.length-1 ;i ++){
            for(int j1 = i+1 ;j1 < arr1.length; j1 ++){
                if(arr2[i] > arr2[j1] || (arr2[i] == arr2[j1] && arr1[i] > arr1[j1])){
                    int temp = arr1[i] ;
                    arr1[i] = arr1[j1] ;
                    arr1[j1] = temp ;

                    int temp1 = arr2[i] ;
                    arr2[i] = arr2[j1] ;
                    arr2[j1] = temp1 ;
                }
            }
        }
        int ans = arr1[k-1] ;
        return ans ;
    }
    public static int powerval(int i){
        int org = i ;
        int count = 0 ;
        while(true){
            if(org == 1){
                break ;
            }
            else{
                if(org%2 == 0){
                    org = org/2 ;
                }
                else{
                    org = (3 * org)+1 ;
                }
                count ++ ;
            }
        }
        return count ;
    }
}