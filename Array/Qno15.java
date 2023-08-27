<<<<<<< HEAD
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                if (nums[l] + nums[r] == (-nums[i])) {
                    List<Integer> tempList = new ArrayList<Integer>();
                    tempList.add(nums[i]);
                    tempList.add(nums[l]);
                    tempList.add(nums[r]);
                    finalList.add(tempList);
                    l++;
                    r--;
                } else if (nums[l] + nums[r] > (-nums[i])) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        finalList = finalList.stream().distinct().collect(Collectors.toList());
        return finalList;
    }
=======
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                if (nums[l] + nums[r] == (-nums[i])) {
                    List<Integer> tempList = new ArrayList<Integer>();
                    tempList.add(nums[i]);
                    tempList.add(nums[l]);
                    tempList.add(nums[r]);
                    finalList.add(tempList);
                    l++;
                    r--;
                } else if (nums[l] + nums[r] > (-nums[i])) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        finalList = finalList.stream().distinct().collect(Collectors.toList());
        return finalList;
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}