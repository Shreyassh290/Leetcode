class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int m=1<<n;
       List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<m;i++){
           ArrayList<Integer> a=new ArrayList<>();
           for(int j=0;j<n;j++){
            if((i>>j)%2==1){
                a.add(nums[j]);
            }
           }
           l.add(a);
        }
        return l;
    }
}