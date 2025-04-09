class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        int pref =1;
        int post=1;
        for(int i=0;i<n;i++){
            res[i]=pref;
            pref*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]*=post;
            post*=nums[i];
        }
        return res;
    }
} 