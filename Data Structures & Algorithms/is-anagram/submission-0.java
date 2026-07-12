class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> m1= new HashMap<>();
        HashMap<Character,Integer> m2= new HashMap<>();
        int n = s.length();
        int n2 = s.length();
        if (n!=n2) return false;
        for (char i :s.toCharArray()){
            if (m1.containsKey(i)){
                m1.put(i,m1.get(i)+1);
            }
            else{
                m1.put(i,1);
            }
        }
        for (char i :t.toCharArray()){
            if (m2.containsKey(i)){
                m2.put(i,m2.get(i)+1);
            }
            else{
                m2.put(i,1);
            }
        }
        return m1.equals(m2);
    }
}
