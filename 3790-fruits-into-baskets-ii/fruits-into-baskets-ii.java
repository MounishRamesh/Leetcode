class Solution {
    public int numOfUnplacedFruits(int[] arr, int[] baskets) {
        List<Integer> ls = new ArrayList<>() ;
        for(int i : baskets){
            ls.add(i) ;
        }
        int count = 0 ;
        for(int i = 0 ; i< arr.length ; i ++){
            boolean ans = false ;
            int max = Integer.MIN_VALUE ;
            for(int j = 0 ; j < ls.size() ; j ++){
                max = Math.max(max , ls.get(j)) ;
                if(ls.get(j) >= arr[i]){
                    ls.remove(j) ;
                    ans = true ;
                    break ;
                    // max = Math.max(max , ls.get(j)) ;
                }
            }
            if(!ans){
                count ++ ;
            }
        }
        return count ;
    }
}