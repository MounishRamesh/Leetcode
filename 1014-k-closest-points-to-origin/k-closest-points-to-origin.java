class Solution {
    public int[][] kClosest(int[][] p, int k) {
        List<Float> ls = new ArrayList<>() ;
        HashMap<Integer,Float> hs = new HashMap<>() ;
        int m = p.length ;
        int n = p[0].length ;
        for(int i = 0 ; i < m ; i ++){
            int a = p[i][0] ;
            int b = p[i][1] ;
            float dis = euld(a,b) ;
            ls.add(dis) ;
            hs.put(i , dis) ;
        }
        Collections.sort(ls) ;
        List<Float> ls1 = new ArrayList<>() ;
        for(int i = 0 ; i< k ; i ++){
            ls1.add(ls.get(i)) ;
        }
        HashSet<Integer> hs1 = new HashSet<>() ;
        for(int i : hs.keySet()){
            float a4 = hs.get(i) ;
            if(ls1.contains(a4)){
                hs1.add(i) ;
                ls1.remove(a4) ;
            }
        }
        int ind = 0 ;
        int[][] arr = new int[hs1.size()][2] ;
        System.out.println(hs1) ;
        for(int i = 0 ; i < m ; i ++){
            if(hs1.contains(i)){
                arr[ind][0] = p[i][0] ;
                arr[ind][1] = p[i][1] ;
                hs1.remove(i) ;
                ind ++ ;
            }
        }
        return arr;
    }
    public static float euld(int a , int b){
        int val1 = (int)Math.pow(a,2) ;
        int val2 = (int)Math.pow(b,2) ;
        float ans = (float)(Math.sqrt(val1+val2)) ;
        return ans ;
    }
}