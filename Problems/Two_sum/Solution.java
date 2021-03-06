package Two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


class Solution {
    public static void main(String[] args) {
        long sum = 21;
        int[] myArray = {0, 2, 11, 19, 90};

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the length of the array:");
//        int length = scanner.nextInt();
//        int [] myArray = new int[length];
//        System.out.println("Enter the elements of the array:");
//        for(int i=0; i<length; i++ ) {
//            myArray[i] = scanner.nextInt();
//        }
//        System.out.println("Enter the target integer:");
//        int sum = scanner.nextInt();

        System.out.println(Arrays.toString(twoSum(myArray, sum)));
    }

//    public static int[] twoSum(int[] a, long target) {
//        int i = 0, j = a.length - 1;
//        while (i < j) {
//            long sum = a[i] + a[j];
//            if (sum == target)
//                return new int[]{i, j};
//            if (sum < target) i++;
//            else j--;
//        }
//        return null;
//    }

    public static int[] twoSum(int[] nums, long target) {

        HashMap<String, Integer> numbers = new HashMap<>();

        for(int i=0; i<nums.length;i++) {
            numbers.put(Integer.toString(nums[i]),i);
        }

        for(int i = 0, place; i<nums.length; i++) {

            int distance = (int) (target - nums[i]);

            if (numbers.containsKey(Integer.toString(distance))) {
                place = numbers.get(Integer.toString(distance));
                if (i!=place){
                    return new int[]{i,place};
                }
            }
        }
        return new int[]{0,0};
    }
}