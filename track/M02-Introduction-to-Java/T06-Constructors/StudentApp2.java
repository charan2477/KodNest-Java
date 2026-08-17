class StudentApp2 {
    public static void main(String[] args) {

        Student2 s1 = new Student2();
        s1.display();

        Student2 s2 = new Student2("Mani");
        s2.display();

        Student2 s3 = new Student2("Ramu", 23, 5.6);
        s3.display();
    }
}

class Student2 {
    String name;
    int age;
    double height;

    // No-argument constructor
    Student2() {
    }

    // Constructor with only name
    Student2(String name) {
        this.name = name;
    }

    // Constructor with name, age and height
    Student2(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}