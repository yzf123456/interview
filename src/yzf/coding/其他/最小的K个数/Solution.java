//这类问题是topk问题

方法一、利用Arrays.sort函数
import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input.length==0 || k==0 || k>input.length) return  list;
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;
    }
}

方法二、借助最大堆
import java.util.ArrayList;
import java.util.Queue;
import java.util.PriorityQueue;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer > list = new ArrayList<>();
        if(k==0||input.length==0 || input.length<k) return list;
        //PrioriQueue<>()默认是小顶堆
        Queue<Integer> heap = new PriorityQueue<>((i1, i2) -> Integer.compare(i2, i1));
        for(int i:input){
            if(heap.size()<k){
                heap.offer(i);
            }else if(heap.peek()>i){
                heap.poll();
                heap.offer(i);
            }
        }
        for(int num:heap){
            list.add(num);
        }
        return list;
   }
}

//方法三、快速选择算法（快排的改进）

