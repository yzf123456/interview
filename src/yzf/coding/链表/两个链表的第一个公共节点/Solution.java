方法一、利用set集合的特性或者map集合
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.HashSet;
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashSet<Integer> set = new HashSet<>();
        while(pHead1!=null){
            set.add(pHead1.val);
            pHead1=pHead1.next;
        }
        while(pHead2!=null){
            if(!set.add(pHead2.val)){
                return pHead2;
            }
            pHead2=pHead2.next;
        }
        
        return pHead2;
 
    }
}

方法二、双指针，m+l，n+l ，m+n+l就会相遇
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2==null) return null;
        ListNode node1=pHead1,node2=pHead2;
        while(node1!=node2){
            node1=node1==null?pHead2:node1.next;
            node2=node2==null?pHead1:node2.next;
        }
        return node1;
    }
}
