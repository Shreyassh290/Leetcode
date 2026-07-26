import java.util.Scanner;
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        
        int mul=0;
        int mul1=0;
        mul=nums[n-1]*nums[n-2]*nums[n-3];
        mul1=nums[0]*nums[1]*nums[n-1];
        if(mul>mul1){
            return mul;
        }
        return mul1;
        
    }
}