import java.util.Stack;
思路：此题要求时间复杂度为O（1），为了达到这样的效果，需要借助辅助栈来完成。辅助栈维持着栈顶是最小值。
public class Solution {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void push(int node) {
        stack1.push(node);
        //只有比栈顶小的元素才可以压入stack2或者stack2为空的时候，这里的设计充分保证了最小值的保留
        if(stack2.isEmpty() || stack2.peek()>=node){
            stack2.push(node);
        }
    }
    
    public void pop() {
        //此判断可以保证两个栈数据一致性
        if(stack1.pop().equals(stack2.peek())){
            stack2.pop();
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}
