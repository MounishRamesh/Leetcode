class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        HashMap<Integer , String> hs = new HashMap<>() ;
        for(int i = 0 ; i < n.length ; i ++){
            hs.put(h[i] , n[i]) ;
        }
        String[] arr = new String[n.length] ;
        Arrays.sort(h) ;
        // System.out.println(hs) ;
        int j = 0 ;
        for(int i = arr.length-1 ; i >= 0; i --){
            arr[j] = hs.get(h[i]) ;
            j ++ ;
        }
        return arr ;
    }
}