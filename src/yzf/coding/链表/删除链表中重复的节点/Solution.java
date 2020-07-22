/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/

//思路：利用双指针
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null  || pHead.next==null) return pHead;
        //创建头结点，以避免头结点被删除.
        ListNode Head = new ListNode(0);
        Head.next=pHead;
        ListNode pre=Head;
        ListNode cur=Head.next;
        while(cur!=null){
            if(cur.next!=null && cur.val==cur.next.val){
                while(cur.next!=null && cur.val==cur.next.val){
                    cur=cur.next;
                }
                //删除该节点
                pre.next=cur.next;
                cur=cur.next;
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
        return Head.next;

    }
}
