class Solution {
    public String oddString(String[] words) {
        String s = "" ;
        for(int i = 0 ; i < words[0].length()-1 ; i ++){
            int[] arr = new int[words.length] ;
            for(int j = 0 ; j < words.length ; j ++){
                int ch = words[j].charAt(i)-'a' ;
                int ch2 = words[j].charAt(i+1)-'a' ;
                int a = ch2 - ch;
                arr[j] = a ;
            }
            int val = hasunique(arr) ;
            if(val != -1){
                return words[val] ;
            }
        }
        return s ;
    }
    public static int hasunique(int[] arr){
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        for(int i : arr){
            hs.put(i , hs.getOrDefault(i,0)+1) ;
        }
        for(int i = 0 ; i < arr.length ; i ++){
            if(hs.get(arr[i]) == 1){
                return i ;
            }
        }
        return -1 ;
    }
    
}