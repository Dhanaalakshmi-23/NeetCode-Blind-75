class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root.left==null&&root.right==null)
        return true;
       return valid(Long.MIN_VALUE,Long.MAX_VALUE,root); 
    }
    boolean valid(long min, long max, TreeNode root)
    {
        if(root==null)
        return true;
        if(root.val>=max||root.val<=min)
        return false;
        return valid(min,root.val,root.left)&&valid(root.val,max,root.right);
    }
}