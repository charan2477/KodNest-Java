import java.util.Scanner;
public class UserInput1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter byte value : ");
        byte a=scan.nextByte();
        System.out.println("byte value is :"+a);

        System.out.println("Enter Short value : ");
        short b=scan.nextShort();
        System.out.println("short value is :"+b);

        System.out.println("Enter int value :");
        int c=scan.nextInt();
        System.out.println("int value is :"+c);
        
        System.out.println("Enter long value :");
        long d=scan.nextLong();
        System.out.println("long value is :"+d);
        
        System.out.println("Enter float value :");
        float e=scan.nextFloat();
        System.out.println("float value is :"+e);
        
        System.out.println("Enter double value :");
        double f=scan.nextDouble();
        System.out.println("double value is :"+f);
        
        System.out.println("Enter boolean value :");
        boolean g=scan.nextBoolean();
        System.out.println("boolean value is :"+g); 
            
    }
}
