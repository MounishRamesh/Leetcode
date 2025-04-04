class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hs = new HashMap<>() ;
        HashMap<Integer,Integer> hm = new HashMap<>() ; 
        for(int i = 0 ; i < arr.length ; i ++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i] , hs.get(arr[i])+1) ;
            }
            else{
                hs.put(arr[i] , 1) ;
            }
        }
        int j =0 ;
        int[] a = new int[hs.size()] ; 
        for(int i : hs.values()){
            a[j] = i ; 
            j ++ ;
        }
        for(int i =0 ; i < a.length ; i ++){
            if(hm.containsKey(a[i])) {
                return false ;
            }
            else{
                hm.put(a[i] , 1) ;
            }
        }
        return true ;
    }
}