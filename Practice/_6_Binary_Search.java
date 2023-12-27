package Practice;

public class _6_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(rank(4, arr, 0, arr.length - 1));
    }

    public static int rank(int key, int[] array , int low , int high) {
        if (low > high) return -1;
        int mid = low + (high - low)/2;

        if (key > array[mid]) return rank(key, array, mid + 1, high);
        else if (key < array[mid]) return rank(key, array, low, mid - 1);
        else return mid;
    }

}
