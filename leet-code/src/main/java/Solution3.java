import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @author : ACE
 * @date : 2019/9/26
 */
public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        Map<String, Character> map = new LinkedHashMap<>();

        char[] chars = s.toCharArray();
        int f = 0, e = 1;
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {

            if (i + 1 < chars.length) {

            }
            int second = i + 1;
        }


        return 0;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

        String s = "pwwkew";
        int res = solution3.lengthOfLongestSubstring(s);
        System.out.println(res);
    }

}
