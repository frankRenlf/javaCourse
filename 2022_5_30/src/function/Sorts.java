package function;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : 2022_5_30
 * @Package : function
 * @createTime : 2022/5/30 14:34
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
public class Sorts {

    public void countSort(int[] arr) {
        int maxVal = arr[0];
        int minVal = arr[0];
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            maxVal = Math.max(maxVal, arr[i]);
            minVal = Math.min(minVal, arr[i]);
        }
        int range = maxVal - minVal + 1;
        int[] count = new int[range];
        for (int k : arr) {
            count[k - minVal]++;
        }
        for (int i = 0, j = 0; i < range; i++) {
            while (count[i]-- > 0) {
                arr[j++] = i + minVal;
            }
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int s1 = left;
        int s2 = mid + 1;
        int[] tmp = new int[right - left + 1];
        int index = 0;
        while (s1 <= mid && s2 <= right) {
            if (arr[s1] > arr[s2]) {
                tmp[index++] = arr[s2++];
            } else {
                tmp[index++] = arr[s1++];
            }
        }
        while (s1 <= mid) {
            tmp[index++] = arr[s1++];
        }
        while (s2 <= right) {
            tmp[index++] = arr[s2++];
        }
        for (int x : tmp) {
            arr[left++] = x;
        }
    }

    private void mSortWhile(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(right);
        stack.push(left);
        while (!stack.isEmpty()) {
            left = stack.pop();
            right = stack.pop();
            if (right <= left) {
                continue;
            }
            int mid = left + ((right - left) >>> 1);
            merge(arr, left, mid, right);
            stack.push(right);
            stack.push(mid + 1);
            stack.push(mid);
            stack.push(left);
        }
    }

    private void mSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + ((right - left) >>> 1);
        mSort(arr, left, mid);
        mSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public void mergeSortNor(int[] arr) {
        int gap = 1;
        int len = arr.length;
        while (gap < len) {
            for (int i = 0; i < len; i += 2 * gap) {
                int mid = i + gap - 1;
                if (mid >= len) {
                    mid = len - 1;
                }
                int right = mid + gap;
                if (right >= len) {
                    right = len - 1;
                }
                merge(arr, i, mid, right);
            }
            gap *= 2;
        }
    }

    public void mergeSortWhile(int[] arr) {
        mSortWhile(arr, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr) {
        mSort(arr, 0, arr.length - 1);
    }

    private void insertSortRange(int[] arr, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >= start; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
    }

    public void quickSortWithoutRec(int[] arr) {
        qSortWithoutRec(arr);
    }

    public void quickSortImproved(int[] arr) {
        qSortImproveWithInsert(arr, 0, arr.length - 1);
    }

    public void quickSortOriginal(int[] arr) {
        qSortOriginal(arr, 0, arr.length - 1);
    }

    private void qSortWithoutRec(int[] arr) {
        int right = arr.length - 1;
        int left = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(left);
        stack.push(right);
        while (!stack.isEmpty()) {
            right = stack.pop();
            left = stack.pop();
            if (right <= left) {
                continue;
            }
            swap(arr, left, medianOfThree(arr, left, right));
            int div = partitionDig(arr, left, right);
            stack.push(left);
            stack.push(div - 1);
            stack.push(div + 1);
            stack.push(right);
        }
    }

    private void qSortOriginal(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int div = partitionTwoPoints1(arr, left, right);
        qSortOriginal(arr, left, div - 1);
        qSortOriginal(arr, div + 1, right);
    }

    private void qSortImproveWithInsert(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        if (right - left + 1 <= 100) {
            insertSortRange(arr, left, right);
            return;
        }
        swap(arr, left, medianOfThree(arr, left, right));
        int div = partitionDig(arr, left, right);
        qSortImproveWithInsert(arr, left, div - 1);
        qSortImproveWithInsert(arr, div + 1, right);
    }

    private int medianOfThree(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;
        if (arr[left] < arr[right]) {
            if (arr[mid] < arr[left]) {
                return left;
            } else if (arr[mid] > arr[right]) {
                return right;
            } else {
                return mid;
            }
        } else {
            if (arr[mid] > arr[left]) {
                return left;
            } else if (arr[mid] < arr[right]) {
                return right;
            } else {
                return mid;
            }
        }
    }


    private int partitionHoare(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[left];
        while (l < r) {
            while (l < r && pivot <= arr[r]) {
                r--;
            }
            while (l < r && pivot >= arr[l]) {
                l++;
            }
            swap(arr, l, r);
        }
        swap(arr, l, left);
        return l;
    }

    private int partitionTwoPoints1(int[] arr, int left, int right) {
        int pre = left;
        int cur = left + 1;
        int pivot = arr[left];
        while (cur <= right) {
            if (arr[cur] < pivot && arr[++pre] != arr[cur]) {
                swap(arr, pre, cur);
            }
            cur++;
        }
        swap(arr, pre, left);
        return pre;
    }

    private int partitionTwoPoints2(int[] arr, int left, int right) {
        int pre = left + 1;
        int pivot = arr[left];
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, pre);
                pre++;
            }
        }
        swap(arr, pre - 1, left);
        return pre - 1;
    }


    private int partitionDig(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[l];
        while (l < r) {
            while (l < r && pivot <= arr[r]) {
                r--;
            }
            arr[l] = arr[r];
            while (l < r && pivot >= arr[l]) {
                l++;
            }
            arr[r] = arr[l];
        }
        arr[l] = pivot;
        return l;
    }

    public void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private void shiftDown(int[] arr, int root, int len) {
        int parent = root;
        int child = parent * 2 + 1;
        while (child < len) {
            if (child + 1 < len && arr[child] < arr[child + 1]) {
                child++;
            }
            if (arr[child] > arr[parent]) {
                swap(arr, child, parent);
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private void createHeap(int[] arr) {
        for (int p = (arr.length - 1 - 1) / 2; p >= 0; p--) {
            shiftDown(arr, p, arr.length);
        }
    }

    public void heapSort(int[] arr) {
        createHeap(arr);
        int end = arr.length - 1;
        while (end >= 0) {
            swap(arr, 0, end);
            shiftDown(arr, 0, end);
            end--;
        }
    }

    public void selectSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }

    private void shell(int[] arr, int gap) {
        int len = arr.length;
        for (int i = gap; i < len; i++) {
            int tmp = arr[i];
            for (int j = i - gap; j >= 0; j -= gap) {
                if (arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                } else {
                    arr[j + gap] = tmp;
                    break;
                }
            }
        }
    }

    public void shellSort(int[] arr) {
        int gap = arr.length;
        while (gap > 1) {
            shell(arr, gap);
            gap /= 2;
        }
        shell(arr, 1);
    }

    public void insertSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
//                    arr[j + 1] = tmp;
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
    }

    public void start(int[] arr) {
        System.out.println("hello");
    }

}
