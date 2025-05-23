public class SearchArr {
    static boolean find(int[] arr, int tar, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == tar || find(arr, tar, index + 1);
    }

    static int findIndex(int[] arr, int tar, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == tar) {
            return index;
        } else
            return findIndex(arr, tar, index + 1);
    }

    static int findIndexLast(int[] arr, int tar, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == tar) {
            return index;
        } else
            return findIndexLast(arr, tar, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 5 };
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexLast(arr, 4, arr.length - 1));
    }
}
