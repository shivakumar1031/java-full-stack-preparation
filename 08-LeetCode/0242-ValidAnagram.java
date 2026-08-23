class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int ch1[]=new int[26];
        int ch2[]=new int[26];
        for(int i=0;i<s.length();i++){
            ch1[s.charAt(i)-'a']++;
            ch2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(ch1[s.charAt(i)-'a']!=ch2[s.charAt(i)-'a'])
                return false;
        }
        return true;
    }
}