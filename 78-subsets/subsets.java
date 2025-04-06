class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>() ;
        List<Integer> arr = new ArrayList<>() ;
        set(nums,0,ls,arr) ;
        return ls ;
    }
    public static void set(int[] nums , int i ,List<List<Integer>> ls,List<Integer> arr){
        if(i == nums.length){
            ls.add(new ArrayList<>(arr)) ;
            return ;
        }
        arr.add(nums[i]) ;
        set(nums,i+1,ls,arr) ;
        arr.remove(arr.size()-1) ;
        set(nums,i+1,ls,arr) ;
    }
}