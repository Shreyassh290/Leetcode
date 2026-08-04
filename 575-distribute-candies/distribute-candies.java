class Solution {
    public int distributeCandies(int[] candyType) {
     Arrays.sort(candyType);
     int c=1;
     int n=candyType.length;
     for(int i=1;i<n;i++){
        if(candyType[i]!=candyType[i-1]){
         c++;
        }
        
     }
     return Math.min(c,n/2);
    }
}