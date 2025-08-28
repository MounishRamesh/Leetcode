class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] arr = new boolean[image.length][image[0].length] ;
        validcheck(image , sr , sc , color , arr , image[sr][sc]) ;
        return image ;
    }
    public static void validcheck(int[][] arr , int a , int b , int c , boolean[][] s , int val){
        if(a <0 || a > arr.length-1 || b < 0 || b > arr[0].length-1){
            return ;
        }
        
        if(s[a][b] || arr[a][b] != val){
            return ;
        }
        if(arr[a][b] == val){
            arr[a][b] = c ;
        }
        s[a][b] = true ;
        validcheck(arr , a-1 ,b , c , s , val) ;
        validcheck(arr , a , b-1 , c , s, val) ;
        validcheck(arr , a+1 , b , c , s, val) ;
        validcheck(arr , a , b+1 , c , s , val) ;
    }
}