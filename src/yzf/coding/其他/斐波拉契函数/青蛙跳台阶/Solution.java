方法一、递归的思想
public class Solution {
    public int JumpFloor(int target) {
        if(target==0) return 0;
        else if(target==1) return 1;
        else if(target==2) return 2;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}

方法二、for循环
public class Solution {
    public int JumpFloor(int target) {
        int f1=1,f2=2,f=0;
        if(target==0) return 0;
        if(target==1) return 1;
        else if(target==2) return 2;
        else{
            for(int i=3;i<=target;i++){
                f=f1+f2;
                f1=f2;
                f2=f;
            }
        }
        return f;
    }
}
