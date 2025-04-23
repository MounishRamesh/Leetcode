class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> hs = new HashMap<>() ;
        int count = 0;
        int sum = 0 ;
        for(int i = 1; i <= n ; i ++){
            int dig = countdig(i) ;
            hs.put(dig,hs.getOrDefault(dig,0)+1) ;
            sum = Math.max(sum , hs.get(dig)) ;
        }
        for(int i : hs.values()){
            if(i == sum){
                count ++ ;
            }
        }
        return count ;
    }
    public static int countdig(int i){
        int sum = 0 ;
        while(i > 0){
            sum += i % 10 ;
            i /= 10 ;
        }
        return sum ;
    }
}