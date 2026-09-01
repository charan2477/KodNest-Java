
import java.util.Scanner;

public class Minele {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        int min = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min Ele: " + min);
        scan.close();
    }
}
