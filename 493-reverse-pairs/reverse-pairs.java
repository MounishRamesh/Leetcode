class Solution {
    public int reversePairs(int[] nums) {
        int count = 0 ;
        List<Long> ls = new ArrayList<>() ;
        for(int i : nums){
            long a = 2L*i ;
            // System.out.print(ls+" ") ;
            int up = upper(ls , a) ;
            // System.out.println(up + " " + a) ;
            count += ls.size()-up ;
            int low = lower(ls , (long)i) ;
            ls.add(low , (long)i) ;
            // System.out.print(ls) ; 
            // System.out.println(); 
        }
        return count ;
    }
    public static int upper(List<Long> ls , long a){
        int left = 0 ;
        int right = ls.size() ;
        while(left < right) {
            int mid = (left+right)/2 ;
            if(ls.get(mid) <= a){
                left = mid+1  ;
            }
            else{
                right = mid ;
            }
        }
        return left ;
    }
    public static int lower(List<Long> ls , long a){
        int left = 0 ;
        int right = ls.size() ;
        while(left < right) {
            int mid = (left+right)/2 ;
            if(ls.get(mid) < a){
                left = mid+1 ;
            }
            else{
                right = mid ;
            }
        }
        return left ;
    }
}