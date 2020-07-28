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
