class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> hs = new HashMap<>() ;
        for(int i = 0 ;i < strs.length ;i ++){
            String s = strs[i] ;
            char[] arr = s.toCharArray() ;
            Arrays.sort(arr) ;
            StringBuilder sb = new StringBuilder() ;
            for(char ch : arr){
                sb.append(ch) ;
            }
            String s1 = sb.toString() ;
            if(!hs.containsKey(s1)){
                hs.put(s1 , new ArrayList<>()) ;
            }
            hs.get(s1).add(s) ;
        }
        List<List<String>> ls = new ArrayList<>() ;
        for(List<String> i : hs.values()){
            ls.add(i) ;
        }
        return ls ;
    }
}