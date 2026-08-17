
import java.util.Scanner;

class Student {
    // Instance variables
    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    // Method to set student details using 'this' keyword
    public void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    // Method to set initial progress using 'this' keyword
    public void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Course Name  : " + courseName);
    }

    // Method to display progress
    public void displayProgress() {
        System.out.println("Completed Topics : " + completedTopics);
        System.out.println("Questions Solved : " + questionsSolved);
    }

    // Method to add completed topics
    public void addTopics(int topics) {
        this.completedTopics += topics;
        System.out.println("\nTopics updated successfully.");
        System.out.println("Total Completed Topics : " + this.completedTopics);
    }

    // Method to add solved questions
    public void addQuestions(int questions) {
        this.questionsSolved += questions;
        System.out.println("\nQuestions updated successfully.");
        System.out.println("Total Questions Solved : " + this.questionsSolved);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("============================");
        System.out.println("   STUDENT PRACTICE TRACKER");
        System.out.println("============================");

        // Input initial student details
        System.out.print("Enter Student Name:\n");
        String name = scanner.nextLine();

        System.out.print("\nEnter Course Name:\n");
        String courseName = scanner.nextLine();

        System.out.print("\nEnter Completed Topics:\n");
        int topics = scanner.nextInt();

        System.out.print("\nEnter Questions Solved:\n");
        int questions = scanner.nextInt();

        // Pass data to object methods
        student.setDetails(name, courseName);
        student.setProgress(topics, questions);

        boolean running = true;

        // Loop menu until exit is selected
        while (running) {
            System.out.println("\n\n============================");
            System.out.println("           MENU");
            System.out.println("============================");
            System.out.println("1. View Student Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Completed Topics");
            System.out.println("4. Add Solved Questions");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice:\n");

            int choice = scanner.nextInt();
            System.out.println();

            if (choice == 1) {
                student.displayDetails();
            } else if (choice == 2) {
                student.displayProgress();
            } else if (choice == 3) {
                System.out.print("Enter New Completed Topics:\n");
                int newTopics = scanner.nextInt();
                student.addTopics(newTopics);
            } else if (choice == 4) {
                System.out.print("Enter New Questions Solved:\n");
                int newQuestions = scanner.nextInt();
                student.addQuestions(newQuestions);
            } else if (choice == 5) {
                System.out.println("Thank you for using Student Practice Tracker.");
                System.out.println("Keep Practicing!");
                running = false;
            } else {
                System.out.println("Invalid choice.");
                System.out.println("Please enter a value between 1 and 5.");
            }
        }

        scanner.close();
    }
}