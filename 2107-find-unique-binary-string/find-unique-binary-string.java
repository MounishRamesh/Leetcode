class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder() ;
        StringBuilder sb1 = new StringBuilder() ;
        for(int i = 0 ;i < nums.length ;i ++){
            char ch = nums[i].charAt(i) ;
            sb.append(ch) ;
        }
        for(int i =0 ; i< sb.length(); i ++){
            char ch1 = sb.charAt(i) ;
            if(ch1 == '0'){
                sb1.append('1') ;
            }
            else{
                sb1.append('0'); 
            }
        }
        return sb1.toString() ;
    }
}