class Solution {
    public int findMin(int[] nums) {
        int i = 0 ;
        int j = nums.length-1 ;
        int min = Integer.MAX_VALUE ;
        while(i < j){
            int mid = i+(j-i)/2 ;
            //System.out.println(mid) ;
            if (nums[mid] > nums[j]) {
                i = mid + 1;
            }
            // System.out.println(nums[mid]) ;
            else{
                j = mid ;
            }
        }
        return nums[i] ;
    }
}

// class Solution {
//     public int findMin(int[] nums) {
//         int i = 0;
//         int j = nums.length - 1;

//         while (i < j) {
//             int mid = i + (j - i) / 2;

//             // If mid element is greater than the last element,
//             // the min must be in the right half
//             if (nums[mid] > nums[j]) {
//                 i = mid + 1;
//             } else {
//                 // The min is at mid or to the left
//                 j = mid;
//             }
//         }
//         // At the end, both i and j will point to the minimum
//         return nums[i];
//     }
// }
