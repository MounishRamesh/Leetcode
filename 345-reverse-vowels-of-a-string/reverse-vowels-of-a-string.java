class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder() ;
        ArrayList<Character> ls = new ArrayList<>() ;
        for(int i = 0 ;i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            if((ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')){
            ls.add(ch) ;
            }
        }
        Collections.reverse(ls) ;
        int j = 0 ;
        for(int i = 0 ;i < s.length() ;i ++){
            char ch = s.charAt(i) ;
            if((ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')){
            sb.append(ls.get(j)) ;
            j ++ ;
            }
            else{
                sb.append(ch) ;
            }
        }
        return sb.toString(); 
    }
    }