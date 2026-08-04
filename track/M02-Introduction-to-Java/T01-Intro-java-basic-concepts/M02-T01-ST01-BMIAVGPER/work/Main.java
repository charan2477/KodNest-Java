public class Main {
    public static void main(String[] args) {
        double Principal=10000.0;
        double rate=6.5;
        double time=2.0;
        double Weight=72.0;
        double height=1.8;
        int marks=78+84+69+91+88;
        
        double simpleInterest=Principal*rate*time/100.0;
        double totalAmount=Principal+simpleInterest;
        double bmi=Weight/(height*height);
        double percentage=marks*100.0/500;
        
        System.out.println("Simple Interest: "+simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + marks);
        System.out.println("Percentage: " + percentage);
    }
}
