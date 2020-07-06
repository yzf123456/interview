import  java.util.ArrayList;

//方案一、暴力法 双层for循环
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        int len=num.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        //判断size是否为零，这属于特殊情况，不考虑的话下面的for循环就会出现越界
        if(size==0) return list;
        for(int i=0;(len-i)>=size;i++){
            int max=num[i];
            for(int j=i+1;(j-i+1)<=size;j++){
                if(num[j]>max){
                    max=num[j];
                }
            }
            list.add(max);
        }
        return list;
    }
}



方案二、单调队列
