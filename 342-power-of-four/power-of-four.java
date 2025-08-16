class Solution {
    public boolean isPowerOfFour(int n) {
        int i = 0 ;
        while(Math.pow(4,i) <= n){
            // System.out.println((int)(Math.pow(4,i))) ;
            if(Math.pow(4,i) == n){
                return true ;
            }
            System.out.println((int)(Math.pow(4,i))) ;
            i ++ ;
        }
        return false ;
    }
}