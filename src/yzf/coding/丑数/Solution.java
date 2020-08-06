//动态规划的思想
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index==0) return 0;
        int a=0,b=0,c=0;
        int [] dp = new int[index];
        //初始值
        dp[0]=1;
        for(int i=1;i<index;i++){
            //下面两行是转移方程
            int n2=dp[a]*2,n3=dp[b]*3,n5=dp[c]*5;
            dp[i]=Math.min(n2,Math.min(n3,n5));
            //递进条件
            if(dp[i]==n2) a++;
            if(dp[i]==n3) b++;
            if(dp[i]==n5) c++;
        }
        //返回值
        return dp[index-1];
    }
}
