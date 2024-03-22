public class WithoutTen {

    public static void main(String[] args) {
        int[] nums1 = {1, 10, 10, 2};
        withoutTen(nums1);
        printArray(nums1);  // Output: [1, 2, 0, 0]

        int[] nums2 = {10, 2, 10};
        withoutTen(nums2);
        printArray(nums2);  // Output: [2, 0, 0]

        int[] nums3 = {1, 99, 10};
        withoutTen(nums3);
        printArray(nums3);  // Output: [1, 99, 0]
    }

    public static void withoutTen(int[] nums) {
        int nextNonTen = 0;

        for (int num : nums) {
            if (num != 10) {
                nums[nextNonTen] = num;
                nextNonTen++;
            }
        }

        while (nextNonTen < nums.length) {
            nums[nextNonTen] = 0;
            nextNonTen++;
        }
    }

    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
