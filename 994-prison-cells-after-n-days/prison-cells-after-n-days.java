class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        int[] arr = new int[8] ;
        for(int i = 0 ; i < arr.length  ;i ++){
            arr[i] = cells[i] ;
        }
        HashMap<String, Integer> hs = new LinkedHashMap<>() ;
        boolean ans = false;
        int length = 0 ;
        int rem = 0 ;
        for(int i = 0 ; i < n; i ++){
            cells = recurse(cells);
            String s = Arrays.toString(cells) ;
            if(hs.containsKey(s)){
                ans = true ;
                length = i-hs.get(s) ;
                rem = (n-i-1)%length ;
                break ;
            }
            hs.put(s , i) ;
            for(int k : cells){
                    System.out.print(k+" ");
                }
            System.out.println() ;
        }
        if(ans){
            for(int i = 0  ; i < rem; i ++){
                cells = recurse(cells);
                for(int k : cells){
                    System.out.print(k+" ");
                }
               System.out.println() ;
            }
        }
        return cells ;
    }
    public static int[] recurse(int[] arr){
        int[] arr2 = new int[8] ;
        arr2[0] = 0 ;
        arr2[7] = 0 ;
        for(int i = 1 ; i < 7 ; i ++){
            if(arr[i-1] == arr[i+1]){
                arr2[i] = 1 ;
            }
            else{
                arr2[i] = 0 ;
            }
        }
        return arr2 ;
    }
}