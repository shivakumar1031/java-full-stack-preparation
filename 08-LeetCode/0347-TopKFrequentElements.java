class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        int[] arr = new int[k];
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<k;i++){
            arr[i]=list.get(i).getKey();
        }
        return arr;
    }
}