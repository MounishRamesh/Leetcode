class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> hs = new HashSet<>() ;
        for(int i = 0 ;i < digits.length ;i ++){
            for(int j = 0 ;j < digits.length ;j ++){
                for(int k = 0 ; k < digits.length ;k ++){
                    if(i == j || j == k || k == i){
                        continue  ;
                    }
                    int num = digits[i]*100 + digits[j]*10 + digits[k] ;
                    if(num>= 100 && num%2 == 0){
                        hs.add(num) ;
                    }
                }
            }
        }
    
        int[] arr = new int[hs.size()] ;
        int j = 0 ;
        for(int i : hs){
            arr[j] = i ;
            j ++ ;
        }
        Arrays.sort(arr) ;
        return arr ;
    }
}