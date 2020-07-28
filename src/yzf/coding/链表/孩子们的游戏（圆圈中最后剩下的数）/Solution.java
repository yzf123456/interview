思路：本题是约瑟夫环问题
方法一、数学方法(反向推导)
//时间复杂度为O(n)，空间复杂度为O(1)

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0||m==0) return -1;
        int flg=0;
        for(int i=2;i<=n;i++){
            flg=(flg+m)%i;
        }
        return flg;
    }
}

方法二、用链表模拟该过程（正向模拟）
//第一次删除的数字下标为(m-1)%n记为c，之后每一次删除的数字下标均为(c+m-1)%list.size()
import java.util.List;
import java.util.ArrayList;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0 || m==0) return -1;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int c=(m-1)%n;
        while(list.size()!=1){
            list.remove(list.get(c));
            c=(c+m-1)%list.size();
        }
        return list.get(0);
    }
}
