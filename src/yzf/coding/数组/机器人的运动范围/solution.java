public class Solution {
    public int movingCount(int threshold, int rows, int cols){
        boolean[] visited = new boolean[rows*cols];
        int counts = rec(threshold,rows,cols,0,0,visited);
        return counts;
    }
    //主要思路是递归，然后就是确定递归的结束条件。自己不太熟练的地方是创建一个数组用来表示已经走过的元素。
    public int rec(int threshold,int rows,int cols,int i,int j,boolean[] visited){
        int num=number(i,j);
        //目前机器人的位置（数组下标从0开始，所以不用减一）
        int k= i*cols+j;
        
        if(i<0||i>rows-1||j<0||j>=cols||visited[k]==true||num>threshold) return 0;
        visited[k]=true;
        return 1+rec(threshold,rows,cols,i-1,j,visited)
                +rec(threshold,rows,cols,i+1,j,visited)
                +rec(threshold,rows,cols,i,j-1,visited)
                +rec(threshold,rows,cols,i,j+1,visited);
    }
    
    public int number(int rows,int cols){
        int num=0;
        while(rows!=0){
            num+=rows%10;
            rows=rows/10;
        }
        while(cols!=0){
            num+=cols%10;
            cols=cols/10;
        }
        return num;
    }
    
}
