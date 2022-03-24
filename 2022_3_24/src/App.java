import java.util.Arrays;

public class App {

    public static void main(String[] args) {
//        int[] arr = new int[]{1,4,6,8,9,13,16};
//        System.out.println(binarySearch(arr,13));
//        int[] arr = new int[]{1, 3, 5, 7, 9};
//        System.out.println(decided(arr));
//        int[] arr = new int[]{1, 10, 2, 5, 2, 1};
//        bs(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5};
        System.out.println(appearOnce(arr));
    }

    public static int appearOnce(int[] arr) {
        int k = 0;
        for (int x : arr) {
            k ^= x;
        }
        return k;
    }

    public static void bs(int[] arr) {
        int len = arr.length;
        int tmp = 0;
        for (int i = 0; i < len - 1; i++) {
            boolean k = true;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                if (arr[j - 1] > arr[j]) {
                    k = false;
                }
            }
            if (k) {
                break;
            }
        }
    }

    public static int decided(int[] arr) {
        int tmp = 0;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i - 1];
            if (tmp > arr[i]) {
                return -1;
            }
        }
        return 1;
    }

    public static int binarySearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] > k) {
                r = mid - 1;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
