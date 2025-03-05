class Solution {
    public int myAtoi(String s) {
        int sum =0 ;
        int count = 0 ;
        int count2 = 0 ;
        int dig = 0 ;
        for(int i = 0 ;i < s.length() ; i ++){
            char ch = s.charAt(i); 
            if((ch >= '0' && ch <= '9') || ch == '-' || ch == '+'){
                if(count == 1 && count2 == 1){
                    break ;
                }
                else if(count > 1 || count2 > 1){
                    break ;
                }
                if(ch == '-' && i == s.length()-1){
                    break ;
                }
                if(ch == '-' && dig != 1){
                    if(i > 0 && s.charAt(i-1) >= '0'&& s.charAt(i-1)<='9'){
                        break ;
                    } 
                    count ++;
                }
                else if(ch == '+' && dig != 1){
                    if(i > 0 && s.charAt(i-1) >= '0' && s.charAt(i-1) <='9'){
                        break ;
                    }
                    count2 ++ ;
                }
                else if(ch == '-' && dig == 1){
                    break ;
                }
                else if(ch == '+' && dig == 1){
                    break ;
                }
                else{
                    int val = ch - '0' ;
                    if(sum > (Integer.MAX_VALUE-val)/10){
                        if(count % 2 != 0){
                            sum = Integer.MIN_VALUE ;
                            break ;
                        }
                        else{
                            sum = Integer.MAX_VALUE; 
                            break ;
                        }
                    }
                    sum = sum * 10 + val ;
                    dig ++; 
                }
            }
            
            else if(ch == ' '){
                if(i > 0 && ((s.charAt(i-1) >= '0' && s.charAt(i-1) <= '9') || s.charAt(i-1) == '+' || s.charAt(i-1) == '-')){
                    break ;
                } 
                else
                continue ;
            }
            else {
                break ;
            }
        }
        if(count % 2 != 0){
            sum = -sum ;
        }
        return sum ;
    }
}