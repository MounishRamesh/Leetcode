class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String , Integer> hs = new HashMap<>() ;
        for(String i : arr){
            hs.put(i , hs.getOrDefault(i,0)+1) ;
        }
        for(String i : arr){
            if(hs.get(i) == 1){
                k -- ;
            }
            if(k == 0){
                return i ;
            }
        }
        return "" ;
    }
}