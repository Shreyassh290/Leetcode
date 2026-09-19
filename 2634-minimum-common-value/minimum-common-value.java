class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n=nums1.length;
        LinkedHashMap<Integer,Integer> t=new  LinkedHashMap<>();
        for(int i=0;i<n;i++){
            t.put(nums1[i],t.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(t.containsKey(nums2[i])){
                return nums2[i];
            }
        }
        return -1;
    }
}