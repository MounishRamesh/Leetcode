class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1 ;
        int j = num2.length()-1 ;
        StringBuilder sb = new StringBuilder() ;
        int rem = 0 ;
        while(i >= 0 || j >= 0){
            int a = 0 ;
            int b = 0 ;
            if(i >= 0){
                a = Character.getNumericValue(num1.charAt(i)) ;
            }
            if(j >= 0){
                b = Character.getNumericValue(num2.charAt(j)) ;
            }
            int sum = a + b + rem ;
            if(sum >= 10){
                sum = sum % 10 ;
                rem = 1; 
            }
            else{
                rem = 0 ;
            }
            sb.append(sum) ;
            i -- ;
            j -- ;
        }
        if(rem == 1){
            sb.append(rem); 
        }
        return sb.reverse().toString() ;
    }
}