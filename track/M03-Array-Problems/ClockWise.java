public class ClockWise {
    public static void main(String[] args) {
        int arr1[] = { 12, 23, 34, 45 };
        int last = arr1[arr1.length - 1];
        for (int i = arr1.length - 1; i > 0; i--) {
            arr1[i] = arr1[i - 1];
        }

        arr1[0] = last;
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
