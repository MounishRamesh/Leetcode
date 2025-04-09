// class Solution {
//     public boolean strongPasswordCheckerII(String password) {
        
//         if(password.length() < 8) return false;

//         boolean hasUpper = false;
//         boolean hasLower = false;
//         boolean hasDigit = false;
//         boolean hasSpecial = false;

//         for(int i = 0; i < password.length(); i++) {
//             char ch = password.charAt(i);

//             if(Character.isUpperCase(ch)) hasUpper = true;
//             if(Character.isLowerCase(ch)) hasLower = true;
//             if(Character.isDigit(ch)) hasDigit = true;
//             if(!Character.isLetterOrDigit(ch)) hasSpecial = true;

//             if(i > 0 && password.charAt(i) == password.charAt(i - 1)) {
//                 return false;
//             }
//         }

//         return hasUpper && hasLower && hasDigit && hasSpecial;
//     }
// }


class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false ;
        }
        boolean dig = false ;
        boolean upp = false ;
        boolean low = false ;
        boolean spe = false ;
        for(int i =0 ; i< password.length(); i++){
            if(i < password.length()-2 && (password.charAt(i) == password.charAt(i+1)) ){
                return false ;
            }
            char ch = (char)(password.charAt(i)) ;
            System.out.print(ch + " ") ;
            if(ch >= '0' && ch <= '9'){
                dig = true ;
                continue ;
            }
            if(ch >= 'a' && ch <= 'z'){
                low = true ;
                continue ;
            }
            if(ch >= 'A' && ch <= 'Z'){
                upp = true ;
                continue ;
            }
            if(ch == '!'|| ch == '#' || ch == '$' || ch == '^'|| ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+' || ch == '@'|| ch == '%'){
                spe = true ;
                continue ;
            }
        }
        System.out.println(dig + " " + upp + " " + low + " " + spe) ;
        if(dig == true && upp == true && low == true && spe == true){
            return true ;
        }
        return false; 
    }
}