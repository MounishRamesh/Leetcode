class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length ;
        int[] arr = new int[n+1] ;
        List<Integer> ls = new ArrayList<>() ;
        for(int i : nums){
            arr[i]++ ;
        }
        for(int i = 1 ; i < arr.length ;i ++){
            if(arr[i] > 1){
                ls.add(i) ;
            }
        }
        return ls ;
    }
}