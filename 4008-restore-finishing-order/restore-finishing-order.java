class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<friends.length;i++){
            h.add(friends[i]);
        } 
        int arr[]=new int [friends.length];
        int k=0;
        for(int i=0;i<order.length;i++){
            if(h.contains(order[i])){
                arr[k++]=order[i];
                h.remove(order[i]);
            }
        }
        return arr;
    }
}