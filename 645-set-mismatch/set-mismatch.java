class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1])swap(nums,nums[i]-1,i);
            //else if(i>nums[i]-1)return new int[]{nums[i],i+1};
            else i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]-1!=i){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void swap(int[] nums,int i,int j){
        if(i!=j){
            nums[i]=nums[i]+nums[j];
            nums[j]=nums[i]-nums[j];
            nums[i]=nums[i]-nums[j];
        }
    }
}