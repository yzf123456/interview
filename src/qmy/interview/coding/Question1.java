package qmy.interview.coding;

/**
 * 剪绳子
 * @author qinmingyuan <qinmingyuan@kuaishou.com>
 * Created on 2020-06-21
 */
public class Question1 {
    public static void main(String[] args) {
        System.out.println(cutRope(8));
    }

    public static int cutRope(int target){
        if(target <= 1){
            return 0;
        }
        if( target == 2){
            return 1;
        }
        if(target ==3){
            return 2;
        }
        if(target == 4){
            return 4;
        }
        int [] dpNumber;
        if(target > 4){
            dpNumber =  new int[target +1];
        }else{
            dpNumber =  new int[5];
        }

        /*
        之前在这里迷了一下，就是为什么dp[2] = 2,dp[3] = 3,dp[4] = 4;
        其实这里都没必要写到dp[4] = 4;这里都dp[2] = 2，和前面都if(target == 2) return 1;含义是不同的。
        这里的dp[2]是计算目前值时，用到的剪前面一刀状态时，生成的值。 我理解为中间的状态量而不是目标值。
        例如：
           如果target == 5， 第一刀剪掉长度为2时，剩下的长度应该为3。那么这个时候生成的最大值应该是dp[2]*dp[3]
         */
        dpNumber[0] = 0;
        dpNumber[1] = 1;
        dpNumber[2] = 2;
        dpNumber[3] = 3;
        dpNumber[4] = 4;

        for(int i = 5; i <=target ; i++){
            int max = -1;
            for(int j = 1; j < i ; j++){
                int var = dpNumber[j]* dpNumber[i-j];
                if(var > max){
                    max = var;
                }
            }
            dpNumber[i] = max;
        }
        return dpNumber[target];
    }
}
