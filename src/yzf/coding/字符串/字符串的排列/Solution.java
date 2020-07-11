//思路：递归+set集合剪枝                                                扩展：set集合可以判断重复元素，map<key,value>可以用来记录重复，因为map可以重复，而且会覆盖。
/*递归：
结束条件：遍历完成
推进：下一个要固定的位置
递归过程：交换c[i]和c[x],也就是把c[i]固定在c[x]处;
         固定位置c[x+1];
         还原交换；
*/
/*
set剪枝：
重复的元素，排列方案也重复，故可以利用集合set的性质来判断重复元素。
import java.util.*;
import java.lang.String;
public class Solution {
    ArrayList<String> list= new ArrayList<>();
    char[] c;
    public ArrayList<String> Permutation(String str) {
        c=str.toCharArray();
        sortAll(0);
        //排序结果
        Collections.sort(list);
        return list;
    }
    
    void sortAll(int x){
        if(x==c.length-1){
            list.add(String.valueOf(c));
            return;
        }
        HashSet<Character>  set = new HashSet<>();
        for(int i=x;i<c.length;i++){
            if(set.contains(c[i])) continue;
            set.add(c[i]);
            swap(i,x);
            sortAll(x+1);
            swap(i,x);
        }
        
    }
    void swap(int i,int x){
        char tmp=c[i];
        c[i]=c[x];
        c[x]=tmp;
    }
}
