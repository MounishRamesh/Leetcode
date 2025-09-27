class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a = 0 ;
        int b = 0 ;
        for(int i = 0 ; i < bills.length ; i ++){
            int val = bills[i] ;
            if(val == 5){
                a ++ ;
            }
            else if(val == 10){
                if(a>0){
                    a-- ;
                }
                else{
                    return false ;
                }
                b ++ ;
            }
            else if(val == 20){
                if(b > 0 && a >= 1){
                    b -- ;
                    a -- ;
                }
                else if(b == 0 && a >= 3){
                    a -= 3 ;
                }
                else{
                    return false ;
                }
            }
        }
        return true ;
    }
}