class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ls = new ArrayList<>() ;
        HashMap<Integer,Integer> hs = new HashMap<>() ;
        int count = 0 ;
        for(int i = 0 ; i < nums1.length ;i ++){
            if(hs.containsKey(nums1[i])){
                hs.put(nums1[i], hs.get(nums1[i])+1) ;
            }
            else{
                hs.put(nums1[i] , 1) ;
            }
        }
        for(int i = 0 ;i < nums2.length ;i ++){
            if(hs.containsKey(nums2[i])){
                ls.add(nums2[i]) ;
                hs.remove(nums2[i]) ;
                count ++ ;
            }
        }
        int[] arr = new int[count] ;
        for(int i = 0 ;i < ls.size() ;i++){
            arr[i] = ls.get(i) ;
        }
        return arr ;
    }
}