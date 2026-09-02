public class AntiClock {
    public static void main(String[] args) {
        int arr1[] = { 12, 23, 34, 45 };
        int last = arr1[0];
        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];
        }
        arr1[arr1.length - 1] = last;
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}