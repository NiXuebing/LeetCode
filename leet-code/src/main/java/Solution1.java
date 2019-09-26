import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 *
 * @author : ACE
 * @date : 2019/9/26
 */
public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tempMap = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            if (tempMap.containsKey(b)) {
                return new int[]{i, tempMap.get(b)};
            }

            tempMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("no result!!!");
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] sum = solution1.twoSum(nums, target);

        System.out.println(Arrays.toString(sum));

    }
}
