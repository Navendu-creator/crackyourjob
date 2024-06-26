class Solution {
    public int pivotIndex(int[] nums) {
    int totalsum=0;
    for(int num:nums){
        totalsum+=num;

    }
     int leftSum = 0;
        int rightSum = totalsum;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
  }
}