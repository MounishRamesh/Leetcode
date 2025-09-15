class Solution {
    public int canBeTypedWords(String text, String b) {
        int count = 0 ;
        String[] arr = text.split(" ") ;
        for(int i = 0 ; i < arr.length ;i ++){
            String a = arr[i] ;
            if(equals(a ,b )){
                count ++ ;
            }
        }
        return count ;
    }
    public static boolean equals(String a , String  b){
        // System.out.println(a + " " + b) ;
        for(int i = 0 ; i < b.length() ;i ++){
            for(int j = 0 ;j < a.length() ;j ++){
                if(b.charAt(i) == a.charAt(j)){
                    // System.out.println(b.charAt(i) + " " + )
                    return false; 
                }
            }
        }
        return true ;
    }
}