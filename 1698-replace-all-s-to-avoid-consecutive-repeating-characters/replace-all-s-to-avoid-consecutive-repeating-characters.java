class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray() ;
        for(int i = 0 ; i < s.length() ;i ++){
            if(arr[i] == '?'){
                char ch = arr[i] ;
                for(char j = 'a' ; j <= 'z' ;j ++){
                    if((i > 0 && arr[i-1] == j) || (i < arr.length-1 && arr[i+1] == j)){
                        continue ;
                    }
                    arr[i] = j ;
                    break ;
                }
                
            }
        }
        StringBuilder sb = new StringBuilder() ;
        for(char i : arr){
            sb.append(i) ;
        }
        return sb.toString() ;
    }
}