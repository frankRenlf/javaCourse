import java.util.Arrays;

class Solution {

    public int binarySearch(int[] nl, int target, boolean flag) {
        int l = 0;
        int ret = nl.length;
        int r = ret - 1;
        while (l <= r) {
            int mid = (l + r) >>> 1;
            if (nl[mid] > target || (flag && nl[mid] >= target)) {
                r = mid - 1;
                ret = mid;
            } else {
                l = mid + 1;
            }
        }
        return ret;
    }

    public int[] searchRange(int[] nl, int target) {
        int li = binarySearch(nl, target, true);
        int ri = binarySearch(nl, target, false) - 1;
        int[] ret = new int[]{-1, -1};
        if (li <= ri && nl[li] == target && nl[ri] == target) {
            ret[0] = li;
            ret[1] = ri;
            return ret;
        }
        return ret;
    }
}


public class App {

    public static void main(String[] args) {
        int[] numbs = new int[]{1, 2, 2, 3, 4, 5, 7, 7, 8};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.searchRange(numbs, 7)));

    }

}
