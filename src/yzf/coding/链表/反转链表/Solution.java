方法一、递归实现
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode cur = ReverseList(head.next);
        head.next.next=head;
        head.next=null;
        return cur;
    }
}

方法二、迭代
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode tem=null;
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
        //负责记录
            tem=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tem;
        }
        return pre;

    }
}

