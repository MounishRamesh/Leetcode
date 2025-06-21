class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length-1 ;
        int carry = 0 ;
        List<Integer>  ls = new ArrayList<>() ;
        while(i >= 0 || k > 0){
            int sum = 0 ;
            int rem = 0 ;
            if(i >= 0){
                sum += num[i] ;
            }
            if(k > 0){
                rem = k%10 ;
                k /= 10 ;
            }
            sum = sum + rem + carry ;
            ls.add(sum % 10) ;
            carry = sum / 10 ;
            System.out.println(sum) ;
            i -- ;
        }
        if(carry != 0){
            ls.add(1) ;
        }
        Collections.reverse(ls) ;
        return ls ;
    }
}