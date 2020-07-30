//方法一、利用BFS+双端队列的性质

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot != null) queue.add(pRoot);
        while(!queue.isEmpty()) {
            //双端队列
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if(res.size() % 2 == 0) tmp.addLast(node.val); // 偶数层 -> 队列尾部
                else tmp.addFirst(node.val); // 奇数层 -> 队列头部
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            //if(res.size() % 2 == 1) Collections.reverse(tmp);
            res.add(new ArrayList(tmp));
        }
        return res;
    }

}

方法二、利用BFS+Collections.reverse()
import java.util.ArrayList;
import java.util.Queue;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot != null) queue.add(pRoot);
        while(!queue.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                 tmp.add(node.val); 
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            if(res.size() % 2 == 1) Collections.reverse(tmp);
            res.add(tmp);
        }
        return res;
    }

}
