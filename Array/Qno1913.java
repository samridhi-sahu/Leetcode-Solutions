<<<<<<< HEAD

// 1913. Maximum Product Difference Between Two Pairs
import java.util.*;

public class Qno1913 {
    class Solution {
        public int maxProductDifference(int[] nums) {
            // int w,x,y,z,p,q;
            // w = nums[0]; p=0;
            // for(int i=1;i<nums.length;i++){
            // if(w<nums[i]) {
            // w = nums[i];
            // p=i;
            // }
            // }
            // y=w;
            // z=w;
            // q=p;
            // for(int i=0;i<nums.length;i++){
            // if(nums[i]<y) {
            // z = y;
            // y = nums[i];
            // q = i;
            // } else if(nums[i]<z&&i!=q){
            // z = nums[i];
            // }
            // }
            // x = y;
            // for(int i=0;i<nums.length;i++){
            // if(x<nums[i]&&i!=p) x = nums[i];
            // }
            Arrays.sort(nums);
            return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
        }
    }
}
=======

// 1913. Maximum Product Difference Between Two Pairs
import java.util.*;

public class Qno1913 {
    class Solution {
        public int maxProductDifference(int[] nums) {
            // int w,x,y,z,p,q;
            // w = nums[0]; p=0;
            // for(int i=1;i<nums.length;i++){
            // if(w<nums[i]) {
            // w = nums[i];
            // p=i;
            // }
            // }
            // y=w;
            // z=w;
            // q=p;
            // for(int i=0;i<nums.length;i++){
            // if(nums[i]<y) {
            // z = y;
            // y = nums[i];
            // q = i;
            // } else if(nums[i]<z&&i!=q){
            // z = nums[i];
            // }
            // }
            // x = y;
            // for(int i=0;i<nums.length;i++){
            // if(x<nums[i]&&i!=p) x = nums[i];
            // }
            Arrays.sort(nums);
            return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
