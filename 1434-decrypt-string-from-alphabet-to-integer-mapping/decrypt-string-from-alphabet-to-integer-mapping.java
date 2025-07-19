class Solution {
    public String freqAlphabets(String s) {
        List<String> arr = new ArrayList<>() ;
        int i = s.length()-1 ;
        while(i >= 0){
            if(s.charAt(i) == '#'){
                arr.add(s.substring(i-2,i)) ;
                i -= 3 ;
            }
            else{
                arr.add(Character.toString(s.charAt(i)));
                i -- ;
            }
        }
        Collections.reverse(arr) ;
        StringBuilder sb = new StringBuilder() ;
        for(String s1 : arr){
            int a = Integer.parseInt(s1) ;
            char ch = (char)((a-1)+'a') ;
            sb.append(ch) ;
        }
        return sb.toString() ;
    }
}