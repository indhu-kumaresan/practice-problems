// class Solution {
//     public int findNumbers(int[] nums) {
//         int tot=0;
//         for(int num:nums){
//             int cnt=0;
//             while(num!=0){
//                 num=num/10;
//                 cnt++;
//             }
//             if(cnt%2==0)
//                 tot++;
//         }
//         return tot;
//     }
// }

class Solution {
  public int findNumbers(int[] nums) {
    int ans = 0;

    for (int num : nums)
      if (9 < num && num < 100 || 999 < num && num < 10000 || num == 100000)
        ++ans;

    return ans;
  }
}
