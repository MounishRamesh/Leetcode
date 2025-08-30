class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> hs = new HashMap<>();
        int m = board.length;
        int n = board[0].length ; 
        int i = 0 ;
        int j = n-1 ;
        while(i < m){
            for(int k =0 ;k < m; k ++){
                char temp = board[k][i] ; 
                if(hs.containsKey(temp)&& temp != '.'){
                    return false ;
                }
                hs.put(temp , 1) ;
            }
            hs.clear();
            i ++ ; 
        }
        int l =0 ;
        while(l < n){
            for(int k =0 ; k < n ;k ++){
                char temp = board[l][k] ;
                if(hs.containsKey(temp) && temp != '.'){
                    return false ;
                }
                else{
                    hs.put(temp , 1); 
                }
            }
            hs.clear() ;
            l++ ;
        }
        for(int i1 =0 ; i1 < 3 ; i1++){
            for(int j1 =0 ;j1 < 3 ; j1 ++){
                for(int k1 = 0 ; k1 < 3 ; k1 ++){
                    for(int l1 = 0 ; l1 < 3 ; l1 ++){
                        int row = i1*3 + k1 ;
                        int col = j1 * 3 + l1;
                        char temp = board[row][col] ;
                        if(hs.containsKey(temp) && temp != '.'){
                            return false ;
                        }
                        if(temp != '.'){
                            hs.put(temp,1) ;
                        }
                    }
                }
                hs.clear() ;
            }
        }
        return true;
    }
}