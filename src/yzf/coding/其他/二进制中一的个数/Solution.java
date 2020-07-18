//方法一、位运算   n&1等于1说明该数二进制最右边为1，n&1=0说明该数二进制最右边为0，然后右移一位进行判断。
public class Solution {
    public int NumberOf1(int n) {
        int res=0;
        while(n!=0){
            res+=n&1;
            n >>>=1;
        }
        return res;
    }
}

//方法二、技巧法   n&=(n-1)可以从右到左消除位数为1。
public class Solution {
    public int NumberOf1(int n) {
        int res=0;
        while(n!=0){
            res++;
            n&=(n-1);
        }
        return res;
    }
}
