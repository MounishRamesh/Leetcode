class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k = n ;
        int n1 = flowerbed.length;
        if(n1 == 1 && flowerbed[0] == 0 && n == 1){
            return true ;
        }
        if(n1 == 2){
            if(flowerbed[0] == 0 && flowerbed[1] == 0 && (n == 1|| n == 0)){
                return true ;
            }
        }
        for(int i = 1 ;i < flowerbed.length-1;i ++){
            if(i == 1 ){
                if((flowerbed[i-1] == 0 && flowerbed[i] == 0)){
                    flowerbed[i-1]= 1 ;
                    k -- ;
                }
            }
            if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && flowerbed[i] == 0){
                flowerbed[i]= 1 ;
                k -- ;
            }
            if(i == n1-2){
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i+1] = 1 ;
                    k -- ;
                }
            }
        }
       // System.out.println(k) ;
        if(k <= 0){
            return true ;
        }
        return false ;
    }
}