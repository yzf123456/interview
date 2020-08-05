//思路：每个对称位置必须相等，否则就不符合。那么什么是对称位置？左节点的左子树和右节点的右子树，左节点的右子树和右节点的左子树。
//利用递归实现，从上到下依次判断
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return pRoot==null ?  true:rec(pRoot.left,pRoot.right);
    }
    //从上往下递归,
    boolean rec(TreeNode l,TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null || l.val!=r.val) return false;
        return rec(l.left,r.right) && rec(l.right,r.left);
    }
}
