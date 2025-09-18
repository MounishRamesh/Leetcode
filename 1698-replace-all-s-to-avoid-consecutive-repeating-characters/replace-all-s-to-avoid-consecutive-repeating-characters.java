class Solution {
    public String modifyString(String s) {
        if(s.length() == 1){
            return "a" ;
        }
        String[] arr = s.split("") ;
        List<String> ls = new ArrayList<>() ;
        for(int i = 0 ; i < arr.length ;i ++){
            if(arr[i].equals("?")){
                if(i == 0){
                    ls.add(arr[i+1]) ;
                }
                else if(i == arr.length-1){
                    ls.add(arr[arr.length-2]) ;
                }
                else{
                    ls.add(arr[i-1]) ;
                    ls.add(arr[i+1]) ;
                }
                for(int j = 0 ; j < 27 ; j ++){
                    char ch = (char)(j+'a') ;
                    if(!ls.contains(String.valueOf(ch))){
                        System.out.println(ch) ;
                        arr[i] = Character.toString(ch) ;
                        break ;
                    }
                }
            }
            ls.clear(); 
        }
        StringBuilder sb = new StringBuilder() ;
        for(String i : arr){
            sb.append(i) ;
        }
        return sb.toString() ;
    }
}