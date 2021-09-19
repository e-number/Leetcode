import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        long sum = 21;
        int[] arr = {0, 2, 11, 19, 90};

        System.out.println(Arrays.toString(twoSum(arr, sum)));
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

        HashMap<String, Integer> numbers = new HashMap<String, Integer>();

        for(int i=0; i<nums.length;i++) {
            numbers.put(Integer.toString(nums[i]),i);
        }

        for(int i=0, place=i; i<nums.length;i++) {

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