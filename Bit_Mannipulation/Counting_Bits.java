class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int x = i;
            while (x > 0) {
                x = x & (x - 1);
                count++;
            }
            res[i] = count;
        }
        return res;
    }
}