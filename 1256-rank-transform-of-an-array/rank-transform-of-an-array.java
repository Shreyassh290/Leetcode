class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer,Integer> h=new TreeMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
           h.put(arr[i],i);
        }
        int c=1;
        for(var i: h.entrySet()){
            int k=i.getKey();
            h.put(k,c++);
        }
        
        for(int i=0;i<n;i++){
            arr[i]=h.get(arr[i]);
        }
        
        return arr;
    }
}