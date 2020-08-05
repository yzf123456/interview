//思路：滑动窗口的方法。

import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > lists =new ArrayList<>();
        int i=1;
        int j=1;
        int target=0;
        while(i<=sum/2){
            if(target<sum){
                //滑动窗口右移
                target+=j;
                j++;
            }else if(target>sum){
                //滑动窗口左移
                target-=i;
                i++;
            }else{
                ArrayList<Integer> list = new ArrayList<Integer> ();
                for(int k=i;k<j;k++){
                    list.add(k);
                }
                lists.add(list);
                //继续下一个点
                target-=i;
                i++;
            }
        }
        return lists;
    }
}
