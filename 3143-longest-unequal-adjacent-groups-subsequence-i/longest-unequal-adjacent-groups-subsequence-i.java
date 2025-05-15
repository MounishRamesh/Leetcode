class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ls = new ArrayList<>() ;
        for(int j = 1 ;j < groups.length ;j ++){
            if(groups[j]!= groups[j-1]){
                ls.add(words[j-1]) ;
            }
        }
        int n = groups.length-1 ;
        if(n != n-1){
            ls.add(words[n]) ;
        }
        return ls ;
    }
}