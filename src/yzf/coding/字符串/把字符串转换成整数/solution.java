class Solution {
    //主要思路是分情况讨论，空格，'+','-',非这三种情况
    //控制好越界问题
     
    public int strToInt(String str) {
        //trim()函数可以去掉首位空格，toCharArray()把字符串转化成字符数组
         char[] c= str.trim().toCharArray();
         if(c.length==0) return 0;
         int first=1, sign=1;
         int flg=Integer.MAX_VALUE/10,res=0;
         //判断第一个字符的类型，如果是'-',设置sign为-1，
         //否则也不是'+'，就从第一个字符开始验证
         if(c[0]=='-'){
             sign=-1;
         }else if(c[0]!='+') first=0;
         for(int j=first;j<c.length;j++){
             if(c[j]<'0'||c[j]>'9')  break;
             if(res>flg||res==flg&&c[j]>'7') return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
             //c[j]忘记减'0'
             res=res*10+(c[j]-'0');
         }
         //忘记符号位
         return sign*res;
    }
}
