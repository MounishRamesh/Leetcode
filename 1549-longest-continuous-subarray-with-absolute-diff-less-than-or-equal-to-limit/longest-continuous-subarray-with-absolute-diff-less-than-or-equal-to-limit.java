class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int count = 0 ;
        int j = 0 ;
        Deque<Integer> max = new ArrayDeque<>() ;
        Deque<Integer> min = new ArrayDeque<>() ;
        for(int i = 0 ; i < nums.length ;i ++){
            while(!min.isEmpty() && min.peekLast() > nums[i]){
                min.pollLast() ;
            }
            min.addLast(nums[i]);
            while(!max.isEmpty() && max.peekLast() < nums[i]){
                max.pollLast() ;
            }
            max.addLast(nums[i]) ;
            //System.out.println(max.peekFirst()+" " + min.peekFirst()) ;
            while(max.peekFirst()-min.peekFirst() > limit){
                if(max.peekFirst() == nums[j]) max.pollFirst();
                if(min.peekFirst() == nums[j]) min.pollFirst(); 
                j ++ ; 
            }
            count = Math.max(i-j+1 , count) ;
        }
        return count ;
    }
}