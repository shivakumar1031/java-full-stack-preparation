class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str= new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>strs[j].length()-1 || ch!=strs[j].charAt(i))
                    return str.toString();   
            }
            str.append(ch);
        }
        return str.toString();
    }
}