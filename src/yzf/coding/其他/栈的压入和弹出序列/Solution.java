思路：利用辅助栈来模拟这两个序列，根据返回结果进行判断
主要步骤：
       根据入栈序列压栈，然后循环判断此刻的栈顶元素是否要出栈。如果栈顶元素等于出栈顺序元素则出栈，序列i++；

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer>  stack = new Stack<>();
        int i=0;
        for(int num:pushA){
            stack.push(num);
            while(!stack.isEmpty()&&stack.peek()==popA[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
