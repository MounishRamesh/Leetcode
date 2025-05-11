class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0 ;i < arr.length-2 ;i ++){
                for(int j = i +1 ;j < arr.length-1 ;j ++){
                    if(arr[i]%2 != 0 && arr[j]%2 !=0){
                        for(int k = j+1 ;j < arr.length ;j ++){
                            if(arr[k]%2 != 0){
                                System.out.print(i + " "+ j + " " + k) ;
                                return true ;
                            }
                        }
                    }
                    else{
                        break ;
                    }
                }
        }
        return false ;
    }
}