class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> ls = new ArrayList<>() ;
        List<Integer> ls1 = new ArrayList<>() ;
        for(int i : nums){
            if(i >=0){
                ls.add(i) ;
            }
            else{
                ls1.add(i) ;
            }
        }
        int[] arr = new int[nums.length] ;
        int i = 0 ; 
        int j = 0 ;
        int k = 0 ;
        while(i < ls.size() || j < ls.size()){
            if(i < ls.size()){
                arr[k] = ls.get(i) ;
                i ++ ;
                k ++ ;
            }
            if(j < ls.size()){
                arr[k] = ls1.get(j) ;
                j ++ ;
                k ++ ;
            }
        }
        return arr ;
    }
}