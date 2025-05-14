class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0 ;
        for(String s : sentences){
            String[] arr = s.split(" ") ;
            int len = arr.length ;
            if(len > max){
                max = len ;
            }
        }
        return max ;
    }
}