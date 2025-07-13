class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i = 0 ;
        int j = 0 ;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0 ;
        while(i < players.length && j < trainers.length){
            //System.out.println(players[i] + " " + trainers[i])
            if(players[i] <= trainers[j]){
                count ++ ;
                i ++;
            }
            j ++ ;
        }
        return count ;
    }
}