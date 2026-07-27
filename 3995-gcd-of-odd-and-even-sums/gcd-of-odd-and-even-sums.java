class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a = n * n;
        int b = n * n + n;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}