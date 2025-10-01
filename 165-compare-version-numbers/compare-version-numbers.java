class Solution {
    public int compareVersion(String v1, String v2) {
        String[] arr = v1.split("\\.") ;
        String[] arr2 = v2.split("\\.") ;
        int i = 0 ;
        // String ans = " " ;
        // String ans1 = " " ;
        while(i < arr.length || i < arr2.length){
            String ans = "" ;
            String ans1 = "" ;
            StringBuilder sb = new StringBuilder() ;
            StringBuilder sb1 = new StringBuilder() ;
            boolean a = false ;
            boolean b = false ;
            if(i < arr.length){
                ans = arr[i] ;
                if(ans.charAt(0) == '0'){
                   a = true ;
                }
            }
            if(i < arr2.length){
                ans1 = arr2[i] ;
                if(ans1.charAt(0) == '0'){
                   b = true ;
                }
            }
            for(int j = 0 ; j < ans.length() ;j ++){
                char ch = ans.charAt(j) ;
                if(a && ch == '0'){
                    continue ;
                }
                else{
                    sb.append(ch) ;
                    a = false ;
                }
            }
            for(int j = 0 ; j < ans1.length() ; j ++){
                char ch = ans1.charAt(j) ;
                if(b && ch == '0'){
                    continue ;
                }
                else{
                    sb1.append(ch) ;
                    b = false ;
                }
            }
            i ++ ;
            if(sb.length() == 0 || sb1.length() == 0){
                if(sb.length() == 0){
                    sb.append(0) ;
                }
                if(sb1.length() == 0){
                    sb1.append(0) ;
                }
            }
            System.out.println(sb.toString() +" " +  sb1.toString()) ;
            int a2 = Integer.parseInt(sb.toString()) ;
            int b2 = Integer.parseInt(sb1.toString()) ;
            if(a2 < b2){
                return -1 ;
            }
            else if(a2 > b2){
                return 1 ;
            }
        }
        
        return 0 ;
    }
}