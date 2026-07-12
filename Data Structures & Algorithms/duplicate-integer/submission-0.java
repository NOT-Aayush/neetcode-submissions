class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> came = new HashSet<>();
        int n = nums.length;
        for (int num : nums){
            if (came.contains(num)){
                return true;
            }
            came.add(num);
        }
        return false ;
    }
}