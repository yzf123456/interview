
//思路深度优先算法
import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
import java.util.ArrayList;
public class Solution {
    ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
    ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        dfs(root,target);
        return lists;
    }
    //先序遍历的方式
    void dfs(TreeNode root,int target){
        if(root==null) return;
        list.add(root.val);
        target-=root.val;
        if(target==0 && root.left==null && root.right==null){
            lists.add(new ArrayList<>(list));
        }
        dfs(root.left,target);
        dfs(root.right,target);
        list.remove(list.size()-1);
    }
}
