class Solution {
    public int numOfSubarrays(int[] arr) {
        int val = 1000000007 ;
        int odd = 0 ;
        int even = 1 ;
        int count = 0 ;
        int sum = 0 ;
        for(int num : arr){
            sum = sum + num ;
            if(sum % 2 == 0){
                count = (count + odd)%val ;
                even ++ ;
            }
            else{
                count = (count + even)% val ;
                odd ++ ;
            }
        }
        return count;
    }
}