class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101] ;
        for(int i : nums){
            arr[i]++ ;
        }
        int max = 0 ;
        for(int i : arr){
            max = Math.max(i , max) ;
        }
        int sum = 0 ;
        for(int i : arr){
            if(i == max){
                sum += i ;
            }
        }
        return sum ;
    }
}