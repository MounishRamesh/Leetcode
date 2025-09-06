class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = score.clone() ;
        HashMap<Integer , Integer> hs = new HashMap<>() ;
        Arrays.sort(score) ;
        int ran = 1 ;
        for(int i = score.length-1 ; i >= 0 ; i --){
            int val = score[i] ;
            hs.put(val , hs.getOrDefault(val , ran++)) ;
        }
        // System.out.println(hs) ;
        String[] a = new String[score.length] ;
        for(int i = 0 ; i < arr.length ;i ++){
           String ans = String.valueOf(hs.get(arr[i])) ;
        //    System.out.println(ans) ;
           if(ans.equals("1")){
              a[i] = "Gold Medal" ;
           }
           else if(ans.equals("2")){
             a[i] = "Silver Medal" ;
           }
           else if(ans.equals("3")){
              a[i] = "Bronze Medal" ;
           }
           else{
            a[i] = ans ;
           }
        }
        return a ;
    }
}