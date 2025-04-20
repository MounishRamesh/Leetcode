class Solution {
    public int numRabbits(int[] answers) {
        int count = 0 ;
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        for(int i : answers){
            hs.put(i , hs.getOrDefault(i , 0)+1) ;
        }
        for(int i : hs.keySet()){
            int val = hs.get(i) ;
            int groups_size = i + 1;
            int group = val/groups_size ;
            if(val % groups_size != 0){
                group += 1 ;
            }
            count += group * groups_size ;
        }
        return count ;
    }
}