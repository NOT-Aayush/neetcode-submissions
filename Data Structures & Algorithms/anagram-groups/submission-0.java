class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;            
        HashMap<String,List> map1 = new HashMap<>();
        for (String i : strs){
            int[] count = new int[26];
            for (char c : i.toCharArray()){
                count[ c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int j :count){
                sb.append('.');
                sb.append(j);
            }
            String key = sb.toString();
            if(!map1.containsKey(key)){
                map1.put(key, new ArrayList<String>());
            }
            map1.get(key).add(i);
        }
        return new ArrayList(map1.values());
        
    }
}
