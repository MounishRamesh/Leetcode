class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>() ;
        int[] arr = new int[nums.length] ;
        Arrays.fill(arr ,-1) ;
        for(int i = 0 ; i < 2*nums.length ;i ++){
            int n = i%nums.length ;
            while(!st.isEmpty() && nums[st.peek()] < nums[n]){
                
                arr[st.pop()] = nums[n] ;
            }
            if(i < nums.length){
                st.push(i) ;
            }
        }
        return arr ;
    }
}