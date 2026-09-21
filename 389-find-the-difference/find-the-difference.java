class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length();
        char m=' ';
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<t.length();i++){
            if(!h.containsKey(t.charAt(i))){
                m=t.charAt(i);
                break;
            }
            else{
                int val=h.get(t.charAt(i));
                if(val==0){
                    m=t.charAt(i);
                    break;
                }
                else{
                h.put(t.charAt(i),val-1);
                }
            }
        }
        return m;
    }
}