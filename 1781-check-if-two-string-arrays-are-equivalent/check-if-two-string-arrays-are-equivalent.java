class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder() ;
        StringBuilder sb1 = new StringBuilder() ;
        for(String i : word1){
            sb.append(i) ;
        }
        for(String i : word2){
            sb1.append(i) ;
        }
        if((sb.toString()).equals((sb1.toString()))){
            return true ;
        }
        return false ;
    }
}