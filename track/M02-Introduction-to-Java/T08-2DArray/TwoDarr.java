import java.util.Scanner;

class TwoDarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[3][5];
        System.out.println("Enter 2d array ele");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}