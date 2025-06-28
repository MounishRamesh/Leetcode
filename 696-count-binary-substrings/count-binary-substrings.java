// class Solution {
//     public int countBinarySubstrings(String s) {
//         int count = 1 ;
//         List<Integer> ls = new ArrayList<>() ;
//         for(int i = 1 ; i < s.length() ;i ++){
//             if(s.charAt(i) == s.charAt(i-1)){
//                 count ++ ;
//             }
//             else{
//                 System.out.println(s.charAt(i) + " " + s.charAt(i-1)) ;
//                 ls.add(count) ;
//                 count = 1 ;
//             }
//         }
//         ls.add(count) ;
        
//         int rem = 0 ;
//         for(int i = 0 ;i < ls.size()-1 ; i ++){
//             int a = ls.get(i) ;
//             int b = ls.get(i+1) ;
//             rem += Math.min(a , b) ;
//         }
//         return rem ;
//     }
// }



class Solution {
    static {
        for (int i = 0; i < 500; i++) countBinarySubstrings("0011");
    }

    public static int countBinarySubstrings(String s) {
        char[] ch = s.toCharArray();
        int prev = 0, curr = 1, res = 0, n = ch.length;

        for (int i = 1; i < n; i++) {
            if (ch[i] == ch[i - 1])
                curr++;
            else {
                res += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        return res + Math.min(prev, curr);
    }
}