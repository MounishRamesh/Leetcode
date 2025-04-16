class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k] ;
        List<Integer> ls = new ArrayList<>() ;
        List<Integer> ls1 = new ArrayList<>() ;
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        for(int i : nums){
            hs.put(i ,hs.getOrDefault(i,0)+1) ;
        }
        for(int i : hs.values()){
            ls.add(i) ;
        }
        ls.sort(Collections.reverseOrder()) ;
        int count = 0 ;
        for(int i : ls){
            for(Map.Entry<Integer , Integer> entry: hs.entrySet()){
                if(entry.getValue() == i && !(ls1.contains(entry.getKey()))){
                    ls1.add(entry.getKey()) ;
                    count ++ ;
                }
                if(count == k){
                    break ;
                }
            }
            if(count == k){
                break ;
            }
        }
        for(int i = 0 ;i < arr.length ;i ++){
            arr[i] = ls1.get(i) ;
            System.out.print(arr[i] + " ") ;
        }
        
        return arr ;
    }
}