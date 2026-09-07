class Solution {
    static int gcd(int x,int y){
        int min=Math.min(x,y);
        int ans=1;
        for(int i=2;i<=min;i++){
            if(x%i==0 && y%i==0){
                ans=i;
            }
        }
        System.out.println(ans);
        return ans;
    }
    public boolean canMeasureWater(int x, int y, int target) {
        int gc=gcd(x,y);
        if(target<=x+y && target%gc==0){
            return true;
        }
        return false;
    }
}