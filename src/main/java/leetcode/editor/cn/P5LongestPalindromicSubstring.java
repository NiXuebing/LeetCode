package leetcode.editor.cn;
//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。 
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划

//最长回文子串
public class P5LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new P5LongestPalindromicSubstring().new Solution();
        String s = "asdfgfdsasd";
        String res = solution.longestPalindrome(s);
        System.out.println(res);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 2) {
                return s;
            }
            int strLen = s.length();
            //最长回文串的起点
            int maxStart = 0;
            //最长回文串的终点
            int maxEnd = 0;
            //最长回文串的长度
            int maxLen = 1;

            boolean[][] dp = new boolean[strLen][strLen];

            for (int r = 1; r < strLen; r++) {
                for (int l = 0; l < r; l++) {
                    if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                        dp[l][r] = true;
                        if (r - l + 1 > maxLen) {
                            maxLen = r - l + 1;
                            maxStart = l;
                            maxEnd = r;

                        }
                    }

                }

            }
            return s.substring(maxStart, maxEnd + 1);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}