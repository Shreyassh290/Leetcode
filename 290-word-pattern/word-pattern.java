class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap<Character,String> h1=new HashMap<>();
        HashMap<String,Character> h2=new HashMap<>();
        String[] s2=s.split(" ");
        if(p.length()!=s2.length) return false;
        for(int i=0;i<p.length();i++){
            char ch1=p.charAt(i);
            String s1=s2[i];
            if(h1.containsKey(ch1) && !h1.get(ch1).equals(s1)) return false;
            if(h2.containsKey(s1) && h2.get(s1)!=ch1) return false;
            h1.put(ch1,s1);
            h2.put(s1,ch1);
        }
        return true;
    }
}