class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1 ;
        int j = num2.length()-1 ;
        StringBuilder sb = new StringBuilder() ;
        int rem = 0 ;
        while(i >= 0 || j >= 0 || rem >0){
            int a = 0 ;
            int b = 0 ;
            if(i >= 0){
                a = (num1.charAt(i) - '0') ;
            }
            if(j >= 0){
                b = (num2.charAt(j) - '0') ;
            }
            int sum = a + b + rem ;
            rem = sum / 10 ;
            sb.append(sum%10) ;
            i -- ;
            j -- ;
        }
        if(rem == 1){
            sb.append(rem); 
        }
        return sb.reverse().toString() ;
    }
}