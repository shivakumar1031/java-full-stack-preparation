class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap();
        for(char ch : ransomNote.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : magazine.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)-1);
            }
            
        }
        for(int i: map.values()){
            if(i>0){
                return false;
            }
        }
        return true;
    }
}