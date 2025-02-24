class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>() ;
        Stack<String> st1 = new Stack<>(); 
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i) ;
            if(Character.isDigit(ch)){
                int num =0 ;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0') ;
                    i ++ ;
                }
                i -- ;
                st.push(num); 
                continue; 
            }
            else if(ch == '['){
                st1.push(Character.toString(ch)) ;
                continue ;
            }
            else if(ch !=']'){
                st1.push(Character.toString(ch)) ;
                continue ;
            }
            StringBuilder sb = new StringBuilder(); 
            while(!st1.peek() .equals("[")){
                sb.insert(0 , st1.pop()); 
            }
            st1.pop() ;
            StringBuilder sb1 = new StringBuilder(); 
            String s1 = sb.toString(); 
            int count = st.pop(); 
            for(int k = 0;k < count; k ++){
                sb1.append(s1); 
            }
            st1.push(sb1.toString()); 
        }  
        StringBuilder sb2 = new StringBuilder(); 
        for(String val : st1){
            sb2.append(val); 
        }
        return sb2.toString();  
    }
}