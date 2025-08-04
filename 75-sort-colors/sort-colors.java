class Solution {
    public void sortColors(int[] nums) {
        int count1 = 0 ;
        int count2 = 0 ;
        int count3 = 0 ;
        for(int i : nums){
            if(i == 0){
                count1 ++ ;
            }
            else if(i == 1){
                count2 ++ ;
            }
            else{
                count3 ++ ;
            }
        }
        //int[] arr = new int[nums.length] ;
        int i = 0 ;
        // System.out.println(count1 + " " + count2 + " " + count3) ;
        while(count1 > 0 || count2 > 0 || count3 > 0){
            //System.out.println(count1 + " " + count2 + " " + count3) ;

            if(count1 > 0){
                nums[i] = 0 ;
                i ++ ;
                count1 -- ;
                continue ;
            }
            else if(count2 > 0){
                nums[i] = 1 ;
                i ++ ;
                count2 -- ;
                continue ;
            }
            else{
                nums[i] = 2 ;
                i ++ ;
                count3 -- ;
            }
        }
    }
}