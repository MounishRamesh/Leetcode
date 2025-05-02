class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new LinkedHashSet<>() ;
        HashSet<Integer> hs1 = new LinkedHashSet<>() ;
        ArrayList<List<Integer>> ls = new ArrayList<>() ;
        for(int i : nums1){
            hs.add(i) ;
        }
        for(int i : nums2){
            hs1.add(i) ;
        }
        List<Integer> ls1 = new ArrayList<>() ;
        for(int i : hs){
            if(!(hs1.contains(i))){
                ls1.add(i) ;
            }
        }
        ls.add(ls1) ;
        List<Integer> ls2 = new ArrayList<>() ;
        for(int i : hs1){
            if(!(hs.contains(i))){
                ls2.add(i) ;
            }
        }
        ls.add(ls2) ;
        return ls ;
    }
}