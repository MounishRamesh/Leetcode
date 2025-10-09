class Solution {
    public int dayOfYear(String d) {
        int ind = 28 ;
        String y = d.substring(0,4) ;
        int a = Integer.parseInt(y) ;
        if((a%4 == 0 && a%100 != 0) || a%400 == 0){
            ind = 29 ;
        }
        String b = d.substring(5 , 7) ;
        int b1 = Integer.parseInt(b) ;
        String d3 = d.substring(8,10) ;
        int d1 = Integer.parseInt(d3) ;
        int mon = 31 ;
        int count = 0 ;
        for(int i = 1 ; i < b1 ; i ++){
            switch (i){
                case 1 :
                  count += 31 ;
                  break ;
                case 2:
                  count += ind ;
                  break ;
                case 3:
                  count += 31 ;
                  break ;
                case 4:
                  count += 30 ;
                  break ;
                case 5:
                  count += 31 ;
                  break ;
                case 6:
                  count += 30 ;
                  break ;
                case 7:
                  count += 31 ;
                  break ;
                case 8:
                  count += 31 ;
                  break ;
                case 9:
                  count += 30 ;
                  break ;
                case 10:
                  count += 31 ;
                  break ;
                case 11:
                  count += 30 ;
                  break ;
                case 12:
                  count += 31 ;
                  break ;
            }
        }
        System.out.println(count) ;
        return count + d1 ;
    }
}