class Solution {
    public boolean isValid(String word) {
        if(word.length() <3){
            return false ;
        }
        int c = 0 ;
        int v = 0 ;
        int d = 0 ;
        for(int i= 0 ;i < word.length() ;i ++){
            char ch = word.charAt(i) ;
            //System.out.println(ch +" ") ;
            if(ch >= '0' && ch <= '9'){
                d ++ ;
                continue ;
            }
            if(isVowels(ch)){
                v ++ ;
                continue;
            }
            if(!isVowels(ch) && ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ){
                //System.out.println(ch +" ") ;
                c ++;
               continue ;
            }
            else{
                return false ;
            }
        }
        System.out.println(c + " " + v +" " + d) ;
        if(c != 0 && v != 0 ){
            return true ;
        }
        return false ;
    }
    public static boolean isVowels(char ch){
        if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch== 'U'){
            return true ;
        }
        return false ;
    }
}