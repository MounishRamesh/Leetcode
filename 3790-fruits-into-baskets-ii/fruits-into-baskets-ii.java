class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] arr) {
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i ++){
            boolean ans = true ;
            for(int j = 0 ; j < arr.length ; j ++){
                if(fruits[i] <= arr[j]){
                    count ++ ;
                    arr[j] = 0 ;
                    break ;
                }
            }
        }
        return fruits.length-count ;
    }
}