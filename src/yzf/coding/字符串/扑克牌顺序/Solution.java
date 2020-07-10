//思路：分析规律，然后再找解决方案。5个顺子(除大小王外)-->这5个数不重复（故可以用set集合判定重复元素，重复就返回false），而且只要满足max-min<5,就满足题意
方法一、遍历+set集合
import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        Set<Integer> set = new HashSet<>();
        int max=0,min=14;
        if(numbers.length==0) return false;
        for(int i=0;i<4;i++){
            if(numbers[i]==0) continue;//跳过0
            if(set.contains(numbers[i])) return false;
            //用max和min函数寻找最大值，最小值
            max=Math.max(numbers[i],max);
            min=Math.min(numbers[i],min);
            set.add(numbers[i]);
        }
        return max-min<5;

    }
}


方法二、排序+遍历

import java.util.Arrays;
public class Solution {
    public boolean isContinuous(int [] numbers) {
    //利用标志位统计0的个数，来进行下一步判断（因为排序了0在前面）
        int flg=0;
        if(numbers.length==0) return false;
        Arrays.sort(numbers);
        for(int i=0;i<4;i++){
            if(numbers[i]==0) flg++;
            else if(numbers[i]==numbers[i+1]) return false;
        }
        return numbers[4]-numbers[flg]<5;

    }
}
