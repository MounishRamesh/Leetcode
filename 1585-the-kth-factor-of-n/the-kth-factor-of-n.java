class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i = 1 ;i <= n ; i++){
            if(n%i == 0){
                list.add(i); 
            }
        }
        for(int i = 0 ; i< list.size(); i ++){
            if(i == k-1){
                int val = list.get(i); 
                return val ;
            }
        }
        return -1 ;
    }
}