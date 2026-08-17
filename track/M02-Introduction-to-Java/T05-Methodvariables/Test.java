public class Test {
    public static void main(String[] args) {
        A a = new A();
        int sum = a.m(10, 20);
        System.out.println(sum);
    }
}

class A {
    short m(short x, short y) {
        return (short)(x + y); // Cast required due to int promotion
    }

    int m(int x, int y) {
        return x + y;
    }
}
