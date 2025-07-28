//485. Max Consecutive Ones
public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int ans  = findMaxConsecutiveOnes(nums);
        System.out.print(ans);

    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxcount;
    }

}
