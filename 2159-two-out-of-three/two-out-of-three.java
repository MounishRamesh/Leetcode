class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set = new HashSet<>() ;
        Set<Integer> set1 = new HashSet<>() ;
        Set<Integer> set2 = new HashSet<>() ;
        List<Integer> ls = new ArrayList<>() ;
        for(int num : nums1){
            set.add(num) ;
        }
        for(int num : nums2){
            if(set.contains(num)){
                set2.add(num) ;
            }
            set1.add(num) ;
        }
        for(int num : nums3){
            if(set.contains(num) || set1.contains(num)){
                set2.add(num) ;
            }
        }
        for(int i : set2){
            ls.add(i) ;
        }
        return ls ;
    }
}