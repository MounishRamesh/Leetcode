// class Solution {
//     public String frequencySort(String s) {
//         HashMap<String , Integer> hs = new HashMap<>() ;
//         List<Integer> ls = new ArrayList<>() ;
//         String[] arr = s.split("") ;
//         Arrays.sort(arr) ;
//         for(String i : arr){
//             hs.put(i , hs.getOrDefault(i , 0 )+1) ;
//         }
//         StringBuilder sb = new StringBuilder() ;
//         for(int i : hs.values()){
//             ls.add(i) ;
//         }
//         Collections.sort(ls) ;
//         Collections.reverse(ls) ;
//         for(int i : ls){
//             for(Map.Entry<String , Integer> entry : hs.entrySet()){
//                 if(entry.getValue() == i){
//                     for(int j = 0 ; j < i ; j++){
//                         sb.append(entry.getKey()) ;
//                     }
//                     hs.remove(entry.getKey()) ;
//                     break ;
//                 }
//             }
//         }
//         return sb.toString() ;
//     }
// }


 class Solution {
    static{
        for(int i=0;i<500;i++){
            frequencySort(new String());
        }
    }
    public static int findMaxI(int[] f)
    {
        int maxi=0;
        int max=0;
        for(int i=0;i<f.length;i++)
        {
            if(f[i]>max)
            {
                maxi=i;
                max=f[i];
            }
        }
        return maxi;
    }
    public static String frequencySort(String s) {
        int[] f=new int[128];
        for(char c:s.toCharArray()){
            f[c]+=1;
        }
        char[] res=new char[s.length()];
        int i=0;
        while(i<s.length()){
            int maxi=findMaxI(f);
            int freq=f[maxi];
            while(freq>0)
            {
                res[i++]=(char)(maxi);
                freq--;
            }
            f[maxi]=0;
        }
        return new String(res);
    }
}