/*
*
本问题的关键是如何使用库函数，StringBuilder(),replace(),str.toString().replaceAll("\\s", "%20");
或者不使用库函数的情况下，如何替换？
分为两种，一是开辟新的字符串，二是在原来的基础上替换，这就需要考虑从前替换还是从后替换，后者的话，每次只需移动一次字符，效率相对较高。
*/
方法一、新建一个StringBuilder()函数
public class Solution {
    public String replaceSpace(StringBuffer str) {
    //x
        StringBuilder newStr= new StringBuilder();
        for(int i=0;i<str.length();i++){
            char  c=str.charAt(i);
            if(c==' ')  newStr.append("%20");
            else  newStr.append(c);
        }
        return newStr.toString();
    }
}

方法二、参考官方解答（https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/solution/mian-shi-ti-05-ti-huan-kong-ge-by-leetcode-solutio/）
class Solution {
    public String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }
}
