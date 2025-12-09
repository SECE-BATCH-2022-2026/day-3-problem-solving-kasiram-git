// 3.checks whether the input array contains any 3 consecutive identical numbers [or] findTriplets
// Day1 -- Problem 3

import java.util.*;

class findTriplets {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print(UserMainCode.findTriplet(arr));
    }
}

class UserMainCode {
    public static boolean findTriplet(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return true;
            }
        }
        return false;
    }
}
