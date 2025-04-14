class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>() ;
        if(s.length() < p.length()){
            return ls ;
        }
        int[] arr = new int[26] ;
        int[] arr2 = new int[26] ;
        int n = p.length() ;
        for(int i =0  ;i < n ;i ++){
            arr[s.charAt(i)-'a'] ++ ;
            arr2[p.charAt(i) - 'a'] ++ ;
        }
        if(Arrays.equals(arr , arr2) ){
            ls.add(0); 
        }
        for(int i = n ;i < s.length() ;i ++){
            arr[s.charAt(i) - 'a'] ++ ;
            arr[s.charAt(i-n) - 'a'] -- ;
            if(Arrays.equals(arr , arr2)){
                ls.add((i-n)+1); 
            }
        }
        return ls ;
    }
}