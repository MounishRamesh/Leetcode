class Solution {
    public int calPoints(String[] operations) {
     Stack<Integer> st = new Stack<>() ;
       for(String i : operations){
           if(i.equals("C")){
              st.pop() ;
           }
           else if(i.equals("D")){
              int val = st.peek() ;
              st.push(val*2) ;
           }
           else if(i.equals("+")){
            int a = st.get(st.size()-1) ;
            int b = st.get(st.size()-2) ;
            st.push(a+b) ;
           }
           else{
            int a = Integer.parseInt(i) ;
            st.push(a) ;
           }
       }   
       System.out.println(st) ;
       int count = 0 ;
       for(int i : st){
           count += i ;
       }
       return count ;
    }
}