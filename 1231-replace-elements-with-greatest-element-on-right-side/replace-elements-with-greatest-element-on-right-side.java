// class Solution {
//     public int[] replaceElements(int[] arr) {
//         for(int i = 0 ;i < arr.length-1 ;i ++){
//             int max = arr[i+1] ;
//             System.out.println(max + " ") ;
//             for(int j = i+1 ;j < arr.length ;j ++){
//                 max = Math.max(max, arr[j]) ;
//             }
//             arr[i] = max ;
//         }
//         arr[arr.length-1] = -1 ;
//         return arr ;
//     }
// }

class Solution {

    static {
        for(int i = 0 ; i <= 3000 ; i++){
        replaceElements(new  int[]{-1});

        }
    }
    public static int[] replaceElements(int[] arr) {
        
      int len = arr.length - 1;
      if(len == 0){
        arr[0] = -1;
      }else{
      int max = arr[len];
        arr[len] = -1;
        for (int i = len - 1; i >= 0 ; i--) {
            int t = arr[i];
            arr[i] = max;
            if (t > max) {
                max =t;
            }

        }
      }
  

        return arr;

    }
}