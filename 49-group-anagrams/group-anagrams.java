class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> strMap = new HashMap<>();

        for (int i = 0; i < strs.length; ++i) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch); // ✅ proper string conversion

            if (strMap.containsKey(key)) {
                strMap.get(key).add(strs[i]);
            } else {
                ArrayList<String> fruits = new ArrayList<>();
                fruits.add(strs[i]);
                strMap.put(key, fruits);
            }
        }

        return new ArrayList<>(strMap.values());
        
    }
}