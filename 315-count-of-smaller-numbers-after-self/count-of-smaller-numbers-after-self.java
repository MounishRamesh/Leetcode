class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ls = new ArrayList<>() ;
        List<Integer> ls1 = new ArrayList<>() ;
        for(int i = nums.length-1 ; i >= 0 ; i --){
            int index = find(ls1 , nums[i]) ;
            ls.add(index) ;
            ls1.add(index , nums[i]) ;
        }
        Collections.reverse(ls) ;
        return ls ;
    }
    public static int find(List<Integer> ls , int i){
        int j = 0 ;
        int k = ls.size() ;
        while(j < k){
            int mid = j+(k-j)/2 ;
            if(ls.get(mid) < i){
                j = mid+1 ;
            }
            else{
                k = mid ;
            }
        }
        return j ;
    }
}