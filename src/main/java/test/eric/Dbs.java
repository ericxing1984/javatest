package test.eric;

//version 3
public class Dbs {
    public static void main(String[] args) {
        //int[] arr = {10,9,2,5,3,7,101,18};
        int[] arr = {1,2,7,3,4,5,7,8};
        System.out.println(solution(arr));
    }

    public static int solution(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int max = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int m = 1, last = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > last) {
                    m++;
                    last = nums[j];
                }
            }
            if (m > max) {
                max = m;
            }
        }
        return max;
    }
}
