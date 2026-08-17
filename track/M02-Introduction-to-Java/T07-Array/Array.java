import java.util.Scanner;

class Array {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("array ele are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}