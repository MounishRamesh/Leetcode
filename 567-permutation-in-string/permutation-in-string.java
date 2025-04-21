class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length() ;
        for(int i = 0; i < n-s1.length()+1 ;i ++){
            String s = s2.substring(i,s1.length()+i) ;
            if(permutations(s, s1)){
                return true ;
            }
        }
        return false ;
    }
    public static boolean permutations(String s , String s1){
        char[] arr = s.toCharArray() ;
        char[] arr2 = s1.toCharArray() ;
        Arrays.sort(arr) ;
        Arrays.sort(arr2) ;
        boolean ans = Arrays.equals(arr,arr2) ;
        if(ans){
            return true ;
        }
        return false ;
    }
}