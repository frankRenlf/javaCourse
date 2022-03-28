import com.bit.frank.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 1;
        int slow = 0;
        int len = nums.length;
        while(fast<len){
            if(nums[fast]!=nums[fast-1]){
                slow++;
                nums[slow]=nums[fast];
            }
            fast++;
        }
        return slow;
    }
}

public class App {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = new int[]{1,1,2};
        System.out.println(sol.removeDuplicates(arr));
    }

    public static void main1(String[] args) {
        TestDemo1 test1 = new TestDemo1(2,3,4);
        System.out.println(test1.a);
        System.out.println(test1.retB());
        TestDemo1 test2 = new TestDemo1(2,3,4);
        System.out.println(test1.equals(test2));
    }

}
