class Solution {
    public char repeatedCharacter(String s) {
        char c=' ';
        HashMap<Character,Integer> h=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(h.containsKey(ch)){
                return ch;
            }
            else{
                h.put(ch,h.getOrDefault(ch,0)+1);
            }
        }
        return c;
    }
}