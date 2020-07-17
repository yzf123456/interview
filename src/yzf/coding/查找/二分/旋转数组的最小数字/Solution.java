
//方法一、单指针判断
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0)  return 0;
        int j=array.length-1;
        if(array[0]<array[j]) return array[0];
        //array[0]>=array[j]等于号是考虑到如果有相等的数，就会报异常
        while(array[0]>=array[j]&&j>0){
            j--;
        }
        return array[j+1];
    }
}
方法二、二分法
//排序数组的查找问题首先考虑使用 二分法 解决，其可将遍历法的 线性级别 时间复杂度降低至 对数级别 (参考大佬)
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        int i=0,j=array.length-1;
        while(i<j){
            int m=(i+j)/2;
            if(array[m]>array[j]) i=m+1;
            else if(array[m]<array[j]) j=m;
            else j--;
        }
        return array[i];
    }
}
