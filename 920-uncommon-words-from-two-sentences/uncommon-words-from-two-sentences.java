class Solution {
    public String[] uncommonFromSentences(String s3, String s4) {
        HashMap<String , Integer> hs = new HashMap<>() ;
        String[] s1 = s3.split(" ") ;
        String[] s2 = s4.split(" ") ;
        for(String i : s1){
            hs.put(i,hs.getOrDefault(i,0)+1) ;
        }
        for(String i : s2){
            hs.put(i , hs.getOrDefault(i,0)+1) ;
        }
        List<String> ls = new ArrayList<>() ;
        // System.out.println(hs) ;
        for(String i : hs.keySet()){
            if(hs.get(i) == 1){
                ls.add(i) ;
            }
        }
        String[] arr = new String[ls.size()] ;
        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = ls.get(i) ;
        }
        return arr ;
    }
}