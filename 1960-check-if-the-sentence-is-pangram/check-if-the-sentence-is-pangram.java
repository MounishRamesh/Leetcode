// class Solution {
//     public boolean checkIfPangram(String s) {
//         boolean[] arr = new boolean[26] ;
//         for(int i = 0 ; i < s.length(); i ++){
//             int ch = s.charAt(i)-'a' ;
//             arr[ch] = true ;
//         }
//         for(boolean i : arr){
//             if(!i){
//                 return false ;
//             }
//         }
//         return true ;
//     }
// }

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean check[]=new boolean[26];
        for(char ch:sentence.toCharArray()){
            if(ch>='a'&&ch<='z'){
                int index=ch-'a';
                check[index]=true;
            }
        }
        for(boolean b:check){
            if(!b){
                return false;
            }
           
        }
         return true;
        
    }
}