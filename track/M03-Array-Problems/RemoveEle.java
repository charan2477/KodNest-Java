import java.util.Scanner;

public class RemoveEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter a index to remove");
        int idx = sc.nextInt();
        int b[] = new int[a.length - 1];
        for (int i = 0; i < idx; i++) {
            b[i] = a[i];
        }
        for (int i = idx; i < b.length; i++) {
            b[i] = a[i + 1];
        }
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}