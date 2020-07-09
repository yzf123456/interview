//方法一、利用substring()函数
public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length()<n) return str;
        StringBuilder newStr = new StringBuilder();
        newStr.append(str.substring(n));
        newStr.append(str.substring(0,n));
        return newStr.toString();
    }
}
//方法二、列表遍历，并使用余数来简化代码
class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder newStr = new StringBuilder();
        for(int i = n; i < n + s.length(); i++)
            newStr.append(s.charAt(i % s.length()));
        return newStr.toString();
    }
}
