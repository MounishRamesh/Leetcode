class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>ls = new ArrayList<>() ;
        HashMap<Integer ,Integer > hs = new HashMap<>() ;
        for(int  i : nums1){
            if(hs.containsKey(i)){
                hs.put(i , hs.get(i) + 1) ;
            }
            else{
                hs.put(i , 1) ;
            }
        }
        for(int i  : nums2){
            if(hs.containsKey(i) && hs.get(i) > 0){
                ls.add(i) ;
                hs.put( i ,hs.get(i) - 1) ;
            }
        }
        int[] arr = new int[ls.size()] ;
        for(int i =0  ;i < arr.length ;i ++){
            arr[i] = ls.get(i) ;
        }
        return arr; // placeholder
    
    }
}