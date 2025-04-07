class Solution {
    public boolean strongPasswordCheckerII(String password) {
        
        if(password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if(Character.isUpperCase(ch)) hasUpper = true;
            if(Character.isLowerCase(ch)) hasLower = true;
            if(Character.isDigit(ch)) hasDigit = true;
            if(!Character.isLetterOrDigit(ch)) hasSpecial = true;

            if(i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                return false;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}