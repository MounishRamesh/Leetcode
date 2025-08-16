class Solution {
    public int maximum69Number (int num) {
        int max = num ;
        int tem = num ;
        int i = 0 ;
        while(num > 0){
            String s = Integer.toString(tem) ;
            int a = toconvert(s , i) ;
            // break ;
            max = Math.max(a , max) ;
            i ++ ;
            num = num/10 ;
           // break ;
        }
        return max ;
    }
    public static int toconvert(String s , int i) {
        StringBuilder sb = new StringBuilder() ;
        for(int j = 0  ; j < s.length() ; j ++){
            char ch = s.charAt(j) ;
            if(i == j){
                if(ch == '6'){
                    sb.append('9') ;
                }
                else{
                    sb.append('6') ;
                }
            }
            else{
                sb.append(ch) ;
            }
        }
        System.out.println(sb.toString()) ;
        return (Integer.parseInt(sb.toString())) ;
    }
}