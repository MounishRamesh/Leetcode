class Solution {
    public char kthCharacter(int k) {
        char ch = 'a' ;
        int length =1 ;
        while(length < k){
            length *= 2 ;
        }
        while(length > 1){
            int half = length/2 ;
            if(k > half){
                k = k - half ;
                ch = (char)((ch-'a'+1)%26+'a'); 

            }
            length /= 2 ;
        }
        return ch ;
    }
}