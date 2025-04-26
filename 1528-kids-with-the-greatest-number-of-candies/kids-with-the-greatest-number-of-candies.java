class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>() ;
        int max = 0 ;
        for(int i : candies){
            max = Math.max(i , max); 
        }
        for(int i : candies){
            if(i+extraCandies >= max){
                ls.add(true) ;
            }
            else{
                ls.add(false) ;
            }
        }
        return ls ;
    }
}