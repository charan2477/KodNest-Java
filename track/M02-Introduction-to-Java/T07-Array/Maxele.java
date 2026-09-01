import java.util.Scanner;

public class Maxele {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        int max = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max Ele: " + max);
        scan.close();
    }
}
