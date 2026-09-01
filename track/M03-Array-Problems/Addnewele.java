import java.util.Scanner;

public class Addnewele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter new ele");
        int newele = sc.nextInt();
        int b[] = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[a.length] = newele;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
