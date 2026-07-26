class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pre =1;
        for (int i=0;i<n;i++){
            arr[i]=pre;
            pre*=nums[i];
        }
        int suff =1;
        for (int j=n-1;j>=0;j--){
            arr[j]*=suff;
            suff*=nums[j];
        }
        return arr;
    }
}