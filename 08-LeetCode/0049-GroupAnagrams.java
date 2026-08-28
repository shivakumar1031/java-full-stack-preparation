class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String ordered = new String(ch);
            map.putIfAbsent(ordered,new ArrayList());
            map.get(ordered).add(str);
        }
        return new ArrayList(map.values());
    }
}