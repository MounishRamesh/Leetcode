class Solution {
    public String[] spellchecker(String[] w, String[] q) {
        HashSet<String> hs = new HashSet<>() ;
        String[] arr = new String[q.length] ;
        for(String i : w){
            hs.add(i) ;
        }
        HashMap<String , String> hs1 = new HashMap<>() ;
        HashMap<String , String> hs2 = new HashMap<>() ;
        for(String i : w){
            String a = i.toLowerCase() ;
            hs1.putIfAbsent(a,i) ;
            String b = vowels(i.toLowerCase()) ;
            hs2.putIfAbsent(b,i) ;
        }
        for(int i = 0 ; i < q.length ; i ++){
            if(hs.contains(q[i])){
                arr[i] = q[i] ;
            }
            else{
                String a1 = q[i].toLowerCase() ;
                if(hs1.containsKey(a1)){
                    arr[i] = hs1.get(a1) ;
                }
                else{
                    String b1 = vowels(a1) ;
                    if(hs2.containsKey(b1)){
                        arr[i] = hs2.get(b1) ;
                    }
                    else{
                        arr[i] = "" ;
                    }
                }
            }
        }
        return arr ;
    }
    public static String vowels(String a){
        StringBuilder sb = new StringBuilder() ;
        String ind = "aeiou" ;
        for(char ch : a.toCharArray()){
            if(ind.indexOf(ch) != -1){
                sb.append("*") ;
            }
            else{
                sb.append(ch) ;
            }
        }
        return sb.toString() ;
    }
}