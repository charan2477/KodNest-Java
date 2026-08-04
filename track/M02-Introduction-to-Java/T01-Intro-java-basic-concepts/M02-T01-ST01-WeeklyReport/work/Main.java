public class Main {
    public static void main(String[] args) {
        // write your code here
        int ct = 17;
        int tt = 20;
        int dlh = 3;
        int ld = 5;
        double pp = ct * 100 / tt;
        System.out.println("Completed Topics: " + ct);
        System.out.println("Remaining Topics: " + (tt - ct));
        System.out.println("Weekly Learning Hours: " + (dlh * ld));
        System.out.println("Progress Percentage: " + pp);
    }
}
