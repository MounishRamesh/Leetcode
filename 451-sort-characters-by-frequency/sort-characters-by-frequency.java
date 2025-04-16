class Solution {
    public String frequencySort(String s) {
        HashMap<String , Integer> hs = new HashMap<>() ;
        List<Integer> ls = new ArrayList<>() ;
        String[] arr = s.split("") ;
        Arrays.sort(arr) ;
        for(String i : arr){
            hs.put(i , hs.getOrDefault(i , 0 )+1) ;
        }
        StringBuilder sb = new StringBuilder() ;
        for(int i : hs.values()){
            ls.add(i) ;
        }
        Collections.sort(ls) ;
        Collections.reverse(ls) ;
        for(int i : ls){
            for(Map.Entry<String , Integer> entry : hs.entrySet()){
                if(entry.getValue() == i){
                    for(int j = 0 ; j < i ; j++){
                        sb.append(entry.getKey()) ;
                    }
                    hs.remove(entry.getKey()) ;
                    break ;
                }
            }
        }
        return sb.toString() ;
    }
}