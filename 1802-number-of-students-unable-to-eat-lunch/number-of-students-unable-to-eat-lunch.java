class Solution {
    public int countStudents(int[] s, int[] sd) {
        List<Integer> ls = new ArrayList<>() ;
        for(int i : s){
            ls.add(i) ;
        }
        List<Integer> ls1 = new ArrayList<>() ;
        for(int i : sd){
            ls1.add(i) ;
        }
        while(ls.contains(ls1.get(0))){
            // System.out.println(ls+" " + ls1) ;
            int val1 = ls.get(0) ;
            int val2 = ls1.get(0) ;
            if(val1 == val2){
                ls.remove(0) ;
                ls1.remove(0) ;
            }
            else{
                Collections.rotate(ls , -1) ;
            }
            if(ls.size() == 0 || ls1.size() == 0){
                return ls.size() ;
            }
            // System.out.println(ls+" " + ls1) ;
        }
        return ls.size() ;
    }
    
}