class Solution {
    public long mostPoints(int[][] questions) {
        int m = questions.length ;
        long[] arr = new long[m] ;
        for(int i = 0 ; i< m ;i ++){
            arr[i] = -1 ;
        }
        return solve(0 , questions, arr) ;
    }
    public static long solve(int i , int[][] questions , long[] arr){
        if( i >= arr.length){
            return 0 ;
        }
        if(arr[i] != -1 ){
            return arr[i] ;
        }
        long solve;
        if (i + questions[i][1] + 1 < questions.length) {
            solve = questions[i][0] + solve(i + questions[i][1] + 1,questions, arr);
        } 
        else {
            solve = questions[i][0];
        }
        long notSolve = solve(i + 1, questions, arr);
        arr[i] = Math.max(solve, notSolve);
        return arr[i];
    }
}