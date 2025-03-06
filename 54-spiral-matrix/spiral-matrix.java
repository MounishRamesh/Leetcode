// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         ArrayList<Integer> list = new ArrayList<>() ;
//         int irow = 0 ;
//         int jcol = matrix[0].length-1 ;
//         //System.out.println(jcol) ;
//         int i = 0 ;
//         int j = matrix.length-1 ;
//         //System.out.println(j); 
//         while(irow <= jcol && i <= j){
//             for(int k = irow ; k <= jcol; k ++){
//                 int a = matrix[irow][k] ;
//                 list.add(a) ;
//             }
//             i ++ ;
//             for(int k = i ; k <= j ; k++){
//                 int a = matrix[k][jcol] ;
//                 list.add(a) ;
//             }
//             jcol -- ;
//             if(i <= j){
//                 for(int k = jcol ; k >= irow; k --){
//                     int a = matrix[j][k] ;
//                     list.add(a) ;
//                 }
//             }
//             j -- ;
//             if(irow <= jcol){
//                 for(int k = j ; k >= i ;k--){
//                     int a = matrix[k][irow] ;
//                     list.add(a) ;
//                 }
//             }
//             irow ++ ;
//             //break ;
//         }
//         return list ;
//     }
// }
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0,left=0,right=m-1,bottom=n-1;

        List<Integer> result=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
                result.add(matrix[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
                result.add(matrix[i][right]);
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }
        return result;
    }
}