class Solution {
    public int removeDuplicates(int[] nums) {
       int n=nums.length;
        if(n==0){
            return 0;
        }
        else{
            int a=0;
            for(int i=0;i<n;i++){
                if(nums[a]!=nums[i]){
                    a++;
                    nums[a]=nums[i];
                }
            }
            return a+1;
        }
    }
}