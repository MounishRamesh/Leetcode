class Solution {
    public int minDeletions(String s) {
        HashMap<Character , Integer> hs = new HashMap<>() ;
        int count = 0 ;
        for(char ch : s.toCharArray()){
            hs.put(ch , hs.getOrDefault(ch , 0)+1) ;
        }
        int[] arr = new int[hs.size()] ;
        int j = 0 ;
        for(int i : hs.values()){
            arr[j] = i ;
            j ++ ;
        }
        Arrays.sort(arr ) ;
        HashSet<Integer> hs1 = new HashSet<>() ;
        for(int i = arr.length-1 ; i >= 0 ;i --){
            int val = arr[i] ;
            // System.out.println(arr[i]) ;
            while(hs1.contains(val)){
                val -- ;
                count ++ ;
                if(val <= 0){
                    break ;
                }
            }
            hs1.add(val) ;
            System.out.println(hs1) ;
        }
        return count ;
    }
}