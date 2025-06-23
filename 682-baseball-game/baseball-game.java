class Solution {
    public int calPoints(String[] operations) {
     Stack<Integer> st = new Stack<>() ;
       for(int i = 0 ;i < operations.length ;i ++){
           System.out.println(st) ;
           String s = operations[i] ;
           if(s.equals("C")){
              st.pop() ;
              continue ;
           }
           if(s.equals("D")){
              int val = st.peek() ;
              st.push(val*2) ;
              continue ;
           }
           if(s.equals("+")){
            int a = st.get(st.size()-1) ;
            int b = st.get(st.size()-2) ;
            st.push(a+b) ;
            continue ;
           }
           int a = Integer.parseInt(s) ;
           st.push(a) ;
       }   
       System.out.println(st) ;
       int count = 0 ;
       for(int i : st){
           count += i ;
       }
       return count ;
    }
}