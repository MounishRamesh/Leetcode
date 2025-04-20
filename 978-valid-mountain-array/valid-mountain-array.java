class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false ;
        }
        int ind = 0 ;
        boolean ans = false ;
        for(int i = 1; i < arr.length ;i ++){
            if(arr[i] <= arr[i-1]){
                ind = i-1 ;
                //System.out.println(ind + " ") ;
                break ;
            }
        }
        if(ind == -1 || ind == 0){
            return false ;
        }
        for(int i = ind ; i < arr.length-1 ; i ++){
            if(arr[i] <= arr[i+1]){
                return false ;
            }
        }
        return true ;
    }
}