/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
方法一、递归实现
import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null) return list;
        rec(listNode);
        return list;
    }
    void rec(ListNode node){
        if(node==null) return;
        rec(node.next);
        list.add(node.val);
    }
}

方法二、利用辅助栈
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> stack = new Stack<Integer>();
        while(listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
