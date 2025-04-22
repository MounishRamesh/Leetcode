class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ") ;
        if(arr.length == 1){
            if((sentence.charAt(0) != sentence.charAt(arr[0].length()-1))){
                return false ;
            }
        }
        for(int i = 0 ;i < arr.length-1 ;i ++){
            String s = arr[i] ;
            String s1 = arr[i+1] ;
            if(!equal(s,s1)){
                return false ;
            }
        }
        String s = arr[arr.length-1] ;
        String s1 = arr[0] ;
        char ch = s.charAt(s.length()-1) ;
        char ch1 = s1.charAt(0) ;
        if(ch != ch1){
            return false ;
        }
        return true ;
    }
    public static boolean equal(String s , String s1){
        int a = s.length() ;
        int b = 0 ;
        //System.out.print(s.charAt(a-1) + " " + s1.charAt(b) + " ") ;
        if(s.charAt(a-1) == s1.charAt(b)){
            return true ;
        }
        return false ;
    }
}