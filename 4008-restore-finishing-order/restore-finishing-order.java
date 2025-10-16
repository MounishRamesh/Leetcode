class Solution {
    public int[] recoverOrder(int[] order, int[] f) {
        List<Integer> ls = new ArrayList<>() ;
        for(int i : f){
            ls.add(i) ;
        }
        int[] arr = new int[f.length] ;
        int ind = 0 ;
        for(int i : order){
            if(ls.contains(i)){
                arr[ind] = i ;
                ind ++ ;
            }
        }
        return arr ;
    }
}