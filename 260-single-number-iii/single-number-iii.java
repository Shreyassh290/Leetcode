class Solution {
    public int[] singleNumber(int[] nums) {
       int p=0;
       for(int i=0;i<nums.length;i++){
        p=p^nums[i];
       } 
       p=(p&(p-1))^p;
       int a1=0;
       int a2=0;
       for(int i=0;i<nums.length;i++){
        if((nums[i]&p)==0){
            a1=a1^nums[i];
        }
        else{
            a2=a2^nums[i];
        }
       }
       int arr[]=new int[2];
       arr[0]=a1;
       arr[1]=a2;
       return arr;
    }
}