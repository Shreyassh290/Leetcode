class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        LinkedHashMap<Character,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        char ch=' ';
        for(var i: h.entrySet()){
            int  v=i.getValue();
            if(v==1){
                ch=i.getKey();
                break;
            }
        }
        if(ch==' '){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}