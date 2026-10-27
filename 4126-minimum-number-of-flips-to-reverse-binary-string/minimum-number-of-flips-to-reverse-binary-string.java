class Solution {
    public int minimumFlips(int n) {
       String s=Integer.toBinaryString(n);
       String r="";
       int c=0;
       for(int i=s.length()-1;i>=0;i--){
        r+=s.charAt(i)+"";
       } 
       for(int i=0;i<=s.length()-1;i++){
        
        if(s.charAt(i)!=r.charAt(i)){
            c++;
        }
       }
       return c;
    }
}