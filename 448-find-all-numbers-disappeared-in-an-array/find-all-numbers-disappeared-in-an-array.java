class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>() ;
        HashMap<Integer,Integer> hs = new HashMap<>() ;
        for(int num : nums){
            hs.put(num , 1) ;
        }
        for(int i = 1 ; i <= nums.length ; i++){
            if(!hs.containsKey(i)){
                list.add(i) ;
            }
        }
        return list ;
    }
}