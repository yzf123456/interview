第一个只出现一次的字符

//思路：利用Hashmap的不可重复的特性，在加上boolen判断。
import java.util.HashMap;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Boolean> map= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c =str.charAt(i);
            //关键步骤，可替代if else
            map.put(c,!map.containsKey(c));
        }
        for(int i=0;i<str.length();i++){
            char c =str.charAt(i);
            if(map.get(c)){
                return i;
            }
        }
        return -1;
        
    }
}
