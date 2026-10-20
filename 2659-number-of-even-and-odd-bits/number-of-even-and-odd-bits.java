class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        int e=0;
        int o=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                if((s.length()-i-1)%2==0){
                    e++;
                }
                else{
                    o++;
                }
            }
        }
        int arr[]=new int[2];
        arr[0]=e;
        arr[1]=o;
        return arr;
    }
}