package MoveZeroes.yywa;

/**
 * @version 1.0
 * @date 2019/5/29 20:12
 * <p>
 * 执行用时 : 1 ms, 在Move Zeroes的Java提交中击败了97.69% 的用户
 * 内存消耗 : 37.3 MB, 在Move Zeroes的Java提交中击败了95.78% 的用户
 **/
public class Move {
    public static void moveZeroes(int[] nums) {
        //定位非零下标
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        //给去除零的非零数组后增加0
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }
}
