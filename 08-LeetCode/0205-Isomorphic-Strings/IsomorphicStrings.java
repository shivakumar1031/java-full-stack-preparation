import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new Hashtable<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2=t.charAt(i);
            if(!map.containsKey(ch1))
                if(!map.containsValue(ch2))
                    map.put(ch1,ch2);
                else
                    return false;
            else if(map.get(ch1)!=ch2){
                return false;
            }
        }
        return true;
    }
}