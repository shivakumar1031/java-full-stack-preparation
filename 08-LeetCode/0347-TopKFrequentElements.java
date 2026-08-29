class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        int[] arr = new int[k];
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] arr= new int[k];
        List<Entry<Integer,Integer>> list = new ArrayList<>(map.EntrySet());
        list.sort((a,b)->a-b);
        for(int i=0;i<=k;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}