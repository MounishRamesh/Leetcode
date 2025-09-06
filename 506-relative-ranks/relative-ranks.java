class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = new int[score.length] ;
        for(int i = 0 ; i < score.length ;i ++){
            int count = 1 ;
            for(int j = 0 ; j < score.length ;j ++){
                if(i != j){
                    if(score[i] < score[j]){
                        count ++ ;
                    }
                }
            }
            arr[i] = count ;
        }
        String[] a = new String[score.length] ;
        for(int i = 0 ; i < a.length; i ++){
            String s = String.valueOf(arr[i]) ;
            if(s.equals("1")){
                a[i] = "Gold Medal" ;
            }
            else if(s.equals("2")){
                a[i] = "Silver Medal" ;
            }
            else if(s.equals("3")){
                a[i] = "Bronze Medal" ;
            }
            else{
                a[i] = s ;
            }
        }
        return a ;
    }
}