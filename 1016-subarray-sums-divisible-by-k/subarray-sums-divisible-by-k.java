class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        int count = 0 ;
        int sum = 0 ;
        hs.put(0,1) ;
        for(int num : nums){
            sum += num ;
            int rem = ((sum%k)+k)%k ;
            count += hs.getOrDefault(rem, 0) ;
            hs.put(rem,hs.getOrDefault(rem,0)+1) ;
        }
        return count ;
    }
}