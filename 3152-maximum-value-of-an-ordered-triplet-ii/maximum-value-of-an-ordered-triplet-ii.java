class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0; 
        
        int[] lmax = new int[n];  
        int[] rmax = new int[n];  

        lmax[0] = nums[0];  
        for (int i = 1; i < n; i++) {  
            lmax[i] = Math.max(lmax[i - 1], nums[i]);  
        }  

        rmax[n - 1] = nums[n - 1];  
        for (int i = n - 2; i >= 0; i--) {  
            rmax[i] = Math.max(rmax[i + 1], nums[i]);  
        }  

        long maxVal = 0;  
        for (int i = 1; i < n - 1; i++) {  
            maxVal = Math.max(maxVal, (long) (lmax[i - 1] - nums[i]) * rmax[i + 1]);  
        }  

        return maxVal;  
    }
}
