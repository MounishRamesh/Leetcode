class Solution {
    public long[] distance(int[] nums) {
        long[] arr = new long[nums.length] ;
        HashMap<Integer,List<Integer>> hs = new HashMap<>() ;
        for(int i = 0 ; i < nums.length ;i ++){
            if(!hs.containsKey(nums[i])){
                hs.put(nums[i] , new ArrayList<>()) ;
            }
            hs.get(nums[i]).add(i) ;
        }
        for(List<Integer> ls : hs.values()){
            int m = ls.size();
            // int sum = 0 ;
            long[] pre = new long[ls.size()] ;
            pre[0] = ls.get(0) ;
            long left , right ;
            for(int i1 = 1 ;i1 < ls.size() ;i1 ++){
                pre[i1] = pre[i1-1]+ls.get(i1) ;
            }
            for(int i1 = 0 ; i1 < m ; i1 ++){
                int ind = ls.get(i1) ;
                if(i1 > 0){
                    left = (long) ind*i1-pre[i1-1] ;
                }
                else{
                    left = 0 ;
                }
                if(i1 < m-1){
                    right = (pre[m-1]-pre[i1]) - (long) ind*(m-i1-1) ;
                }
                else{
                    right = 0 ;
                }
                arr[ind] = left+right ;
            }
        }
        return arr ;
    }
}