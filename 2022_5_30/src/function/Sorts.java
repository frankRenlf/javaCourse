package function;

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
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    arr[j + 1] = tmp;
                    break;
                }
            }
        }
    }

    public void start(int[] arr) {
        System.out.println("hello");
    }

}
