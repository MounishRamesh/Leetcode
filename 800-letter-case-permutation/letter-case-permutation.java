class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> ls = new ArrayList<>() ;
        StringBuilder sb = new StringBuilder() ;
        ans(ls , s , sb , 0) ;
        return ls ;
    }
    public static void ans(List<String> ls , String s , StringBuilder sb , int i){
        if(i == s.length()){
            String n = sb.toString() ;
            ls.add(n) ;
            return ;
        }
        char ch = s.charAt(i) ;
        if(Character.isLetter(ch)){
            sb.append(Character.toUpperCase(ch)) ;
            ans(ls , s , sb , i+1) ;
            sb.deleteCharAt(sb.length()-1) ;
            sb.append(Character.toLowerCase(ch)) ;
            ans(ls , s , sb , i+1) ;
            sb.deleteCharAt(sb.length()-1) ;
        }
        else{
            sb.append(ch) ;
            ans(ls , s , sb , i+1) ;
            sb.deleteCharAt(sb.length()-1) ;
        }
    }
}