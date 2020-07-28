思路：快慢指针
方法一、自己的写法，有点绕
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null) return null;
        ListNode pre=head;
        ListNode cur=head;
        while(k>0&&cur!=null){
            cur=cur.next;
            k--;
        }
        if(k>0){
            return null;
        }
        while(cur!=null){
            pre=pre.next;
            cur=cur.next;
        }
        return pre;

    }
}


方法二、简洁，自己就是没想到
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null) return null;
        ListNode pre=head;
        ListNode cur=head;
        for(int i=0;i<k;i++){
            if(cur==null) return null;
            cur=cur.next;
        }
        while(cur!=null){
            pre=pre.next;
            cur=cur.next;
        }
        return pre;

    }
}
