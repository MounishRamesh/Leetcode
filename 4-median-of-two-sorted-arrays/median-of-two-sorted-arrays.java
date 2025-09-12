class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length ;
        int[] arr = new int[nums1.length + nums2.length] ;
        int j = 0 ;
        for(int i = 0 ; i < nums1.length ;i ++){
            arr[i] = nums1[i] ;
            // System.out.println(arr[i] + " " + i) ;
        }
        j = nums1.length ;
        for(int i = 0 ; i < nums2.length ;i ++){
            arr[j] = nums2[i] ;
            // System.out.println(arr[j] + " " + j) ;
            j ++ ;
        }
        
        Arrays.sort(arr) ;
        int n = arr.length/2 ;
        // System.out.print(n + " " + arr[n]) ;
        double mid = (double)(arr[n]) ;
        // System.out.println(arr.length/2) ;
        if(arr.length%2 != 0){
            return mid ;
        }
        // System.out.println((double)5/2) ;
        double b = (double)arr[n]+arr[n-1] ;
        double val = (double)(b/2) ;
        return val ;
    }
}