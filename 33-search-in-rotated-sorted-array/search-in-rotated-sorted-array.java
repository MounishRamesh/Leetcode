class Solution {
    public int search(int[] arr, int target) {
        int i = 0 ;
        int j = arr.length-1 ;
        while(i <= j){
            int mid = i+(j-i)/2 ;
            if(arr[mid] == target){
                return mid ;
            }
            else if(arr[i] <= arr[mid]){
                if(target >= arr[i] && target < arr[mid]){
                    j = mid-1 ;
                }
                else{
                    i = mid+1 ;
                }
            }
            else{
                if(target <= arr[j] && target > arr[mid]){
                    i = mid +1 ;
                }
                else{
                    j = mid-1;
                }
            }
            // System.out.println(i + " " + j + " " + mid) ;
        }
        return -1 ;
    }
} 