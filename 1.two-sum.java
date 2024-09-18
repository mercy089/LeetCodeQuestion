/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {

    public static int[] twoSum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
// @lc code=end

