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


// class Solution {
//     public int calPoints(String[] operations) {
//          Stack<Integer> stack = new Stack<>();

//         for (String op : operations) {
//             if (op.equals("+")) {
//                 int last = stack.pop();
//                 int secondLast = stack.peek();
//                 stack.push(last);
//                 stack.push(last + secondLast);
//             } else if (op.equals("D")) {
//                 stack.push(2 * stack.peek());
//             } else if (op.equals("C")) {
//                 stack.pop();
//             } else {
//                 stack.push(Integer.parseInt(op));
//             }
//         }

//         int total = 0;
//         for (int score : stack) {
//             total += score;
//         }

//         return total;
//     }
// }