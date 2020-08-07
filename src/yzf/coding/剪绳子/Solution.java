//方法一、数学推导
//当所有绳段长度相等时，乘积最大,最优的绳段长度为3
public class Solution {
    public int cutRope(int target) {
        if(target<=3) return target-1;
        int a=target/3,b=target%3;
        if(b==1) return (int)Math.pow(3,a-1)*4;
        if(b==2) return (int)Math.pow(3,a)*2;
        return (int)Math.pow(3,a);
    }
}

//动态规划（复制的代码）
public class Solution {
    public int cutRope(int target) {
        int[] dp =new int[target+1];
        for(int i=2;i<=target;i++){
            for(int j=1;j<i;j++){
                dp[i]=Math.max(dp[i],Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[target];

    }
}
