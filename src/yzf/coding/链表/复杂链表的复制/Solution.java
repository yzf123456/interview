//思路：HashMap
//步骤，1，遍历链表，将节点作为key、新初始化一个跟当前节点值相等的节点作为值存到HashMap中；2，通过get函数分别指定新建节点的下个节点是旧节点的下个节点。
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
import java.util.HashMap;
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null) return pHead;
        HashMap<RandomListNode,RandomListNode>  nodeMap=new HashMap<>();
        RandomListNode node=pHead;
        while(node!=null){
            nodeMap.put(node,new RandomListNode(node.label));
            node=node.next;
        }
        node=pHead;
        while(node!=null){
            nodeMap.get(node).next=nodeMap.get(node.next);
            nodeMap.get(node).random=nodeMap.get(node.random);
            node=node.next;
        }
        return nodeMap.get(pHead);
        
    }
}
