class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder() ;
        sb.append(num) ;
        boolean check = false ;
        int i = 0 ;
        while(!check && i < sb.length()){
            char ch = sb.charAt(i) ;
            if(ch == '6'){
                sb.setCharAt(i , '9');
                check= true; 
            }
            i ++ ;
        }
        return Integer.parseInt(sb.toString()); 
    }
}