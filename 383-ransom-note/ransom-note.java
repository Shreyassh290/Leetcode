class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> h=new HashMap<>();
        int n=m.length();
        for(int i=0;i<n;i++){
            h.put(m.charAt(i),h.getOrDefault(m.charAt(i),0)+1);
        }
        for(int i=0;i<r.length();i++){
            if(!h.containsKey(r.charAt(i))){
                return false;
            }
            else{
                int val=h.get(r.charAt(i));
                if(val==0){
                    return false;
                }
                else{
                    h.put(r.charAt(i),val-1);
                }
            }
        }
        return true;
    }
}