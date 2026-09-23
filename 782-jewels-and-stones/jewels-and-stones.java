class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        int c=0;
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if(h.containsKey(ch)){
                c+=h.get(ch);
            }
        }
        return c;
    }
}