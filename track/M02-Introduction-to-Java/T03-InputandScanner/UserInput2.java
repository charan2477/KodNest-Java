import java.util.Scanner;
public class UserInput2 {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scan.nextInt();
        System.out.println("Age is :" +age);
        System.out.println("Enter your height : ");
        float height =scan.nextFloat();
        System.out.println("your height: "+height);
        scan.nextLine();
        System.out.println("Enter your name : ");
        String name =scan.nextLine();
        System.out.println("name: "+name);
    }
    
}
