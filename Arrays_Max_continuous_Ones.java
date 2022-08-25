class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0,max=0;
        for(int num:nums){
            if(num==1)
                cnt++;
            else{
                max=Math.max(cnt,max);
                cnt=0;
            }
        }
        return Math.max(cnt,max);
    }
}
