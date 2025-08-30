// class Solution {
//     public void gameOfLife(int[][] board) {
//         int m = board.length ;
//         int n = board[0].length ;
//         int[][] arr = new int[m][n] ;
//         for(int i = 0 ; i < m ;i ++){
//             for(int j = 0 ; j < n ;j ++){
//                 int count1 = dfs(board , i , j) ;
//                 if(board[i][j] == 1){
//                     System.out.println(i + " " + j + " " + count1) ;
//                     if(count1 <2 || count1 > 3){
//                         arr[i][j] = 0 ;
//                     }
//                     else{
//                         arr[i][j] = 1 ;
//                     }
//                 }
//                 else{
//                     System.out.println(i + " " + j + " " + count1) ;
//                     if(count1 == 3){
//                         arr[i][j] = 1 ;
//                     }
//                     else{
//                         arr[i][j] = 0 ;
//                     }
//                 }
//             }
//         }
//         for(int i = 0 ; i < m ; i ++){
//             for(int j = 0 ; j < n ; j ++){
//                 board[i][j] = arr[i][j] ;
//             }
//         }
//     }
//     public static int dfs(int[][] arr , int i , int j ){
//         int count = 0 ;
//         if(i+1 < arr.length && arr[i+1][j] == 1){
//             count ++ ;
//         }
//         if(i-1 >= 0 && arr[i-1][j] == 1){
//             count ++ ;
//         }
//         if(j+1 < arr[0].length && arr[i][j+1] == 1){
//             count ++ ;
//         }
//         if(j-1 >= 0 && arr[i][j-1] == 1){
//             count ++ ;
//         }
//         if(i+1 < arr.length && j+1 < arr[0].length && arr[i+1][j+1] == 1){
//             count ++ ;
//         }
//         if(i-1 >= 0 && j-1 >= 0 && arr[i-1][j-1] == 1){
            
//             count ++ ;
//         }
//         if(i+1 < arr.length && j-1 >= 0 && arr[i+1][j-1] == 1){
//             count ++ ;
//         }
//         if(i-1 >= 0 && j+1 < arr[0].length &&  arr[i-1][j+1] == 1){
//             count ++ ;
//         }
//         return count ;
//     }
    
// }

class Solution {
    public void gameOfLife(int[][] board) {

        int[][] ans=new int[board.length][board[0].length];
        if(board.length==1 && board[0].length==1){
            //System.out.println(board.length+"xx"+board[0].length);
            if(board[0][0]!=0){
                board[0][0]=0; return;
            }else{
                return;
            }
        }
        //System.out.println(board.length+"first"+board[0].length);
        if(board.length==1 && board[0].length==2){
            System.out.println("first");
             board[0][0]=0; board[0][1]=0; return;
        }
        if(board.length==2 && board[0].length==1){
            System.out.println("sec");
             board[0][0]=0; board[1][0]=0; return;
        }

        if(board.length==1 && board[0].length>2){
            System.out.println("only row");
            for(int j=1;j<board[0].length-1;j++){
                int livecount=0;
                 if(board[0][j]==1){
                    if(board[0][j+1]==1) livecount++; //right
                    if(board[0][j-1]==1) livecount++; //left
                    if(livecount==2) ans[0][j]=1;
                 }
                
            }
            ans[0][0]=0; ans[0][board[0].length-1]=0;
            for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]=ans[i][j];
            }
            //System.out.println(); // Move to the next line
        }
        return;
        }
        if(board[0].length==1 && board.length>2){
            System.out.println("only column"+"::::"+board[0].length);
            for(int i=1;i<board.length-1;i++){
                System.out.println("inside for");
                int livecount=0;
                if(board[i][0]==1){
                    if(board[i+1][0]==1) livecount++; //down
                    if(board[i-1][0]==1) livecount++; //top
                    if(livecount==2) ans[i][0]=1;
                }
                System.out.println(livecount+"::livecount");
            }
            ans[0][0]=0; ans[board.length-1][0]=0;
            System.out.println("xxxxxx"+Arrays.deepToString(ans));
            for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]=ans[i][j];
            }
            //System.out.println(); // Move to the next line
        }
        return;
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int livecount=0;
                if(board[i][j]==1){ 
                    if(i==0 && j==0){ //left corner
                        if(board[i+1][j]==1) livecount++;
                        if(board[i][j+1]==1) livecount++;
                        if(board[i+1][j+1]==1) livecount++;
                        if(livecount>=2 && livecount<=3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==0 && j<board[0].length-1){ //top row
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i+1][j-1]==1) livecount++; // down left
                        if(board[i+1][j+1]==1) livecount++; //down right
                        if(board[i][j+1]==1) livecount++; //right
                        if(board[i][j-1]==1) livecount++; //left
                        if(livecount>=2 && livecount<=3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==0 && j==board[0].length-1){ //right corner
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i+1][j-1]==1) livecount++; // down left
                        if(board[i][j-1]==1) livecount++; //left
                        if(livecount>=2 && livecount<=3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(j==0 && i<board.length-1){ //left side
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i][j+1]==1) livecount++; //right
                        if(board[i-1][j+1]==1) livecount++; //top right
                        if(board[i+1][j+1]==1) livecount++; //down right
                        if(livecount>=2 && livecount<=3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i<board.length-1 && j==board[0].length-1){ //rigth side
                        if(board[i][j-1]==1) livecount++; //left
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i-1][j-1]==1) livecount++; //top left
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i+1][j-1]==1) livecount++; // down left
                        if(livecount>=2 && livecount<=3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==board.length-1 && j==0){ //down left corner
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i-1][j+1]==1) livecount++; //top right
                        if(board[i][j+1]==1) livecount++; //right
                        if(livecount>=2 && livecount<=3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==board.length-1 && j==board[0].length-1){ //down right corner
                        if(board[i][j-1]==1) livecount++; //left
                        if(board[i-1][j-1]==1) livecount++; //top left
                        if(board[i-1][j]==1) livecount++; //top
                        if(livecount>=2 && livecount<=3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==board.length-1 && j<=board[0].length-1){ //down row
                        if(board[i-1][j-1]==1) livecount++; //top left
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i-1][j+1]==1) livecount++; //top right
                        if(board[i][j-1]==1) livecount++; //left
                        if(board[i][j+1]==1) livecount++; //right
                        if(livecount>=2 && livecount<=3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }                    
                    else{
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i+1][j-1]==1) livecount++; // down left
                        if(board[i+1][j+1]==1) livecount++; //down right
                        if(board[i][j+1]==1) livecount++; //right
                        if(board[i][j-1]==1) livecount++; //left
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i-1][j-1]==1) livecount++; //top left
                        if(board[i-1][j+1]==1) livecount++; //top right
                        if(livecount>=2 && livecount<=3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }
                }else { 
                    if(i==0 && j==0){ //left corner
                        if(board[i+1][j]==1) livecount++;
                        if(board[i][j+1]==1) livecount++;
                        if(board[i+1][j+1]==1) livecount++;
                        if(livecount==3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==0 && j<board[0].length-1){ //top row
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i+1][j-1]==1) livecount++; // down left
                        if(board[i+1][j+1]==1) livecount++; //down right
                        if(board[i][j+1]==1) livecount++; //right
                        if(board[i][j-1]==1) livecount++; //left
                        if(livecount==3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==0 && j==board[0].length-1){ //right corner
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i+1][j-1]==1) livecount++; // down left
                        if(board[i][j-1]==1) livecount++; //left
                        if(livecount==3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(j==0 && i<board.length-1){ //left side
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i][j+1]==1) livecount++; //right
                        if(board[i-1][j+1]==1) livecount++; //top right
                        if(board[i+1][j+1]==1) livecount++; //down right
                        if(livecount==3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i<board.length-1 && j==board[0].length-1){ //rigth side
                        if(board[i][j-1]==1) livecount++; //left
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i-1][j-1]==1) livecount++; //top left
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i+1][j-1]==1) livecount++; // down left
                        if(livecount==3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==board.length-1 && j==0){ //down left corner
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i-1][j+1]==1) livecount++; //top right
                        if(board[i][j+1]==1) livecount++; //right
                        if(livecount==3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==board.length-1 && j==board[0].length-1){ //down right corner
                        if(board[i][j-1]==1) livecount++; //left
                        if(board[i-1][j-1]==1) livecount++; //top left
                        if(board[i-1][j]==1) livecount++; //top
                        if(livecount==3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }else if(i==board.length-1 && j<=board[0].length-1){ //down row
                        if(board[i-1][j-1]==1) livecount++; //top left
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i-1][j+1]==1) livecount++; //top right
                        if(board[i][j-1]==1) livecount++; //left
                        if(board[i][j+1]==1) livecount++; //right
                        if(livecount==3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }                    
                    else{
                        if(board[i+1][j]==1) livecount++; //down
                        if(board[i+1][j-1]==1) livecount++; // down left
                        if(board[i+1][j+1]==1) livecount++; //down right
                        if(board[i][j+1]==1) livecount++; //right
                        if(board[i][j-1]==1) livecount++; //left
                        if(board[i-1][j]==1) livecount++; //top
                        if(board[i-1][j-1]==1) livecount++; //top left
                        if(board[i-1][j+1]==1) livecount++; //top right
                        if(livecount==3) {ans[i][j]=1;}
                        else{ans[i][j]=0;}
                        livecount=0;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]=ans[i][j];
            }
            //System.out.println(); // Move to the next line
        }
    }
}