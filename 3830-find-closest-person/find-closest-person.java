// class Solution {
//     public int findClosest(int x, int y, int z) {
//         int count1 = Math.abs(x-z) ;
//         int count2 = Math.abs(y-z) ;
//         if(count1 == count2){
//             return 0 ;
//         }
//         else if(count1 < count2){
//             return 1 ;
//         }
//         else{
//             return 2 ;
//         }
//     }
// }

class Solution {
    public int findClosest(int x, int y, int z) {
        int distanceX = Math.abs(z-x);
        int distanceY = Math.abs(z-y);

        if(distanceX > distanceY)
        {
            return 2;
        }
        else if(distanceX == distanceY)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}