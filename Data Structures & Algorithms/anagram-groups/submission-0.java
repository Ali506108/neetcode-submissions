class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            List<String > list = map.getOrDefault(key , new ArrayList<>());
            list.add(strs[i]);
            map.put(key , list);
        }

        return new ArrayList<>(map.values());
    }


}
