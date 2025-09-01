class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] arr = new boolean[rooms.size()] ;
        // System.out.println(rooms.size()) ;
        List<Integer> n = new ArrayList<>() ;
        List<Integer> ls = rooms.get(0) ;
        for(int i = 0 ;i < ls.size() ; i ++){
            n.add(ls.get(i)) ;
            arr[ls.get(i)] = true ;
        }
        for(int i = 0 ;i < n.size() ; i ++){
            List<Integer> ls1 = rooms.get(n.get(i));
            System.out.println(ls1); 
            for(int j : ls1){
                if(!arr[j]){
                    n.add(j); 
                }
                arr[j] = true ;
            }
        }
        for(int i = 1 ; i < arr.length ;i ++){
            if(!arr[i]){
                return false ;
            }
        }
        return true ;
    }
}