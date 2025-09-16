class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>() ;
        for(int i : nums){
            st.push(i) ;
            // System.out.println(st) ;
            while(st.size()>1){
                int a = st.pop() ;
                int b = st.pop() ;
                if(gcd(a,b)!= 1){
                    int val = lcm(a,b) ;
                    st.push(val) ;
                }
                else{
                    st.push(b) ;
                    st.push(a) ;
                    break ;
                }
            }
        }
        return new ArrayList<>(st);
    }
    public static int gcd(int a , int b){
        if(b == 0){
            return a ;
        }
        return gcd(b,a%b) ;
    }
    public static int lcm(int a , int b){
        return ((a)/gcd(a,b))*b ;
    }
}