class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Character> h2=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(h1.containsKey(ch1) && h1.get(ch1)!=ch2) return false;
            if(h2.containsKey(ch2) && h2.get(ch2)!=ch1) return false;
            h1.put(ch1,ch2);
            h2.put(ch2,ch1);
        }
        return true;
    }
}