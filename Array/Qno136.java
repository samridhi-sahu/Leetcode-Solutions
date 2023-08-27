
// 136. Single Number

public class Qno136 {
    public int singleNumber(int[] nums) {

        // n2 tc + 1 sc solution --->
        // naive approach

        // n tc + n sc solution --->
        // using frequency table method hashmap

        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for(int i = 0; i < nums.length; i++){
        // if(map.containsKey(nums[i])){
        // map.put(nums[i], map.get(nums[i])+1);
        // } else map.put(nums[i], 1);
        // }
        // for(int i = 0; i < nums.length; i++){
        // if(map.get(nums[i])==1) return nums[i];
        // }
        // return 0;

        // n tc + 1 sc solution --->
        // using XOR bit manipulation

        int xorvalue = 0;
        for (int i = 0; i < nums.length; i++) {
            xorvalue = xorvalue ^ nums[i];
        }
        return xorvalue;
    }
}
