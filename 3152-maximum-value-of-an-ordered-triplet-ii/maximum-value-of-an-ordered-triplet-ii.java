class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0; 
        
        int[] arr1 = new int[n];  
        int[] arr2 = new int[n];  

        arr1[0] = nums[0];  
        for (int i = 1; i < n; i++) {  
            arr1[i] = Math.max(arr1[i-1], nums[i]);  
        }  

        arr2[n - 1] = nums[n - 1];  
        for (int i = n - 2; i >= 0; i--) {  
            arr2[i] = Math.max(arr2[i+1], nums[i]);  
        }  

        long Val = 0;  
        for (int i = 1; i < n - 1; i++) {  
            Val = Math.max(Val, (long) (arr1[i - 1] - nums[i]) * arr2[i + 1]);  
        }  

        return Val;  
    }
}
