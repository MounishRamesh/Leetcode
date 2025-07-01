class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ls1 = new HashSet<>() ;
        List<List<Integer>> ls2 = new ArrayList<>() ;
        pmu(nums , 0 , ls1) ;
        for(List<Integer> i : ls1){
            ls2.add(i) ;
        }
        return ls2 ;
    }
    public static void pmu(int[] nums , int i , Set<List<Integer>> ls1){
        if(i == nums.length-1){
            List<Integer> ls = new ArrayList<>() ;
            for(int j : nums){
                ls.add(j) ;
            }
            ls1.add(ls) ;
            return ;
        }
        for(int k = i ; k < nums.length ;k ++){
            swap(nums , i , k) ;
            pmu(nums , i+1 , ls1) ;
            swap(nums , i , k) ;
        }
    }
    public static void swap(int[] nums , int i , int j){
        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
}