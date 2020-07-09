public class Solution {
//思路：双指针，substring(a,b)左闭右开[a,b)
//算法解析：
//倒序遍历字符串 s ，记录单词左右索引边界 i, j ；
//每确定一个单词的边界，则将其添加至单词列表 newStr ；
//最终，将单词列表拼接为字符串，并返回即可。
    public String ReverseSentence(String str) {
        String s= str.trim();
        StringBuilder newStr = new StringBuilder();
        int j=s.length()-1,i=j;
        //特殊情况
        if(i<0) return str;
        //从后往前查找
        while(i>=0){
            while(i>=0&&s.charAt(i)!=' ') i--;
            newStr.append(s.substring(i+1,j+1)+" ");
            while(i>=0&&s.charAt(i)==' ') i--;
            j=i;
        }
        return newStr.toString().trim();
    }
}
