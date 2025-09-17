class Solution {
    public String convert(String s, int n) {
        int[] arr = new int[s.length()] ;
        int j = 0 ;
        int i = 0 ;
        while(i < s.length()){
            arr[i] = j ;
            i ++ ;
            j ++ ;
            if(j == n){
                j = n-2 ;
                while(j >= 0 && i < s.length()){
                    arr[i] = j ;
                    j -- ;
                    i ++ ;
                }
                j = 1 ;
            }
        }
        for(int i1 : arr){
            System.out.print(i1 + " ") ;
        }
        StringBuilder sb = new StringBuilder() ;
        for(int k = 0 ; k <= n+2000 ; k ++){
            for(int l = 0 ; l < arr.length ;l ++){
                if(arr[l] == k){
                    sb.append(s.charAt(l)) ;
                }
            }
        }
        return sb.toString() ;
    }
}