class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ls1 = new ArrayList<>() ;
        pmu(nums , 0 , ls1) ;
        return ls1 ;
    }
    public static void pmu(int[] nums , int i , List<List<Integer>> ls1){
        if(i == nums.length-1){
            List<Integer> ls = new ArrayList<>() ;
            for(int j : nums){
                ls.add(j) ;
            }
            if(isvalid(ls , ls1)){
                ls1.add(ls) ;
            }
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
    public static boolean isvalid(List<Integer> ls , List<List<Integer>> ls1){

        if(ls1.contains(ls)){
            System.out.println(ls) ;
            return false ;
        }
        return true ;
    }
}