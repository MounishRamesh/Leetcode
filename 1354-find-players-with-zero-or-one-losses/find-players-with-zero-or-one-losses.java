class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ls = new ArrayList<>() ;
        ArrayList<Integer> win = new ArrayList<>() ;
        ArrayList<Integer> loss = new ArrayList<>() ;
        int[] arr1 = new int[100001] ;
        int[] arr2 = new int[100001] ;
        int n = matches.length ;
        for(int i = 0 ;i< n ;i++){
            arr1[matches[i][0]] ++ ;
        }
        for(int i = 0 ;i< n ;i++){
            arr2[matches[i][1]] ++ ;
        }
        for(int i = 0 ;i < arr1.length ;i ++){
            if(arr1[i] >= 1 && arr2[i] == 0){
                win.add(i) ;
            }
        }
        ls.add(win) ;
        for(int i = 0 ;i < arr1.length ;i ++){
            if(arr2[i] == 1){
                loss.add(i) ;
            }
        }
        ls.add(loss) ;
        return ls ;
    }
}