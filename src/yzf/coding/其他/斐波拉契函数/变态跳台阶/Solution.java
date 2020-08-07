// 暴力法
public class Solution {
    public int JumpFloorII(int n) {
        int[] tup = new int[n+1];
        tup[0]=1;
        tup[1]=1;
        for(int i=2;i<=n;i++){
            //tup[i]=0;//
            for(int j=0;j<i;j++){
                tup[i]+=tup[j];
            }
        }
        return tup[n];
    }
}
 
//优化 f[n]=2*f[n-1],可以使用递归，递推的方式
//递推
public class Solution {
    public int JumpFloorII(int n) {
        if(n==0 || n==1) return 1;
        int a=1,b=0;
        for(int i=2;i<=n;i++){
            b=a<<1;
            a=b;
        }
        return b;
    }
}
// 递归
public class Solution {
    public int JumpFloorII(int n) {
        if(n==0 || n==1) return 1;
        return JumpFloorII(n-1)<<1;
    }
}

//进一步优化 2的n-1次方。
public class Solution {
    public int JumpFloorII(int n) {
        return (int)Math.pow(2,n-1);
    }
}
