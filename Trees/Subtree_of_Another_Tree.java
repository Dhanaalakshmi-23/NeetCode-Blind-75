class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return helper(root,subRoot);
    }

    private boolean helper(TreeNode p,TreeNode q){
        if(p==null){
            return false;
        }
        if(issame(p,q)){
            return true;
        }

        return helper(p.left, q) || helper(p.right, q);
    }

    public boolean issame(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return issame(p.left, q.left) && issame(p.right, q.right);
}
}