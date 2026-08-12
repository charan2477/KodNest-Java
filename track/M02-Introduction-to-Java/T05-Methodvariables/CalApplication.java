public class CalApplication {
    public static void main(String[] args) {
	    Addition al =new Addition();
	    System.out.println(al.add(3,5));
	    System.out.println(al.add(2.3,1));
	    System.out.println(al.add(2, 3,2.5));
	}  
}

public class Addition {
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	double add(int a,double b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	double add(double a,double b,double c) {
		return a+b+c;
	}
	double add(int a,int b,double c) {
		return a+b+c;
	}
}

