class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i : arr){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i: freqMap.values()){
            set.add(i);
        }
        return set.size() == freqMap.size();
    }
}