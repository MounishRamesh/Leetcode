class Solution {
    public int findCircleNum(int[][] nums) {
        int count = 0 ;
        ArrayList<Integer> ls = new ArrayList<>() ;
        for(int i = 0 ;i < nums.length ; i ++){
            if(ls.contains(i)){
                continue ;
            }
            count++ ;
            List<Integer> visit = new ArrayList<>() ;
            visit.add(i); 
            ls.add(i) ;
            while( !visit.isEmpty()){
                int tem = visit.remove(0) ;
                for(int j = 0 ; j < nums.length ; j ++){
                    if(nums[tem][j] == 1 && (!ls.contains(j))){
                        ls.add(j); 
                        visit.add(j) ;
                    }
                }
            }
        }
        return count ;
    }
}