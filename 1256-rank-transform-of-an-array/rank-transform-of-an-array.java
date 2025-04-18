class Solution {
    public int[] arrayRankTransform(int[] arr_val) {
        int[] arr = new int[arr_val.length] ;
        for(int i = 0 ;i < arr_val.length ;i ++){
            arr[i] = arr_val[i] ;
        }
        Arrays.sort(arr) ;
        int[] arr2 = new int[arr.length] ;
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        HashMap<Integer , Integer> hs1 = new HashMap<>() ;
        
        int j = 1 ;
        int n = arr.length ;
        if(n <= 0){
            return arr_val ;
        }
        for(int i = 0  ;i < arr.length-1 ;i ++){
            if(arr[i] == arr[i+1]){
                arr2[i] = j ;
            }
            else{
                arr2[i] = j ;
                j ++ ;
            }
        }
        if(arr[n-1] == arr[n-1]){
            arr2[n-1] = j ;
        }
        else{
            arr2[n-1] = j-1 ;
        }
        for(int i = 0 ;i < arr.length ;i ++){
            
            hs.put(arr[i] , arr2[i]) ;
        }
        int[] arr3 = new int[arr.length] ;
        int k = 0 ;
        for(int i : arr_val){
            if(hs.containsKey(i)){
                int ans = hs.get(i) ;
                arr[k] = ans ;
                k ++ ;
            }
        }
        return arr ;
    }
}