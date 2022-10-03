import java.util.*;

public class PracticeSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = 100;
        System.out.println("Enter the Sub1 Marks");
        int Sub1 = sc.nextInt();
        System.out.println("Enter the Sub2 Marks");
        int Sub2 = sc.nextInt();
        System.out.println("Enter the Sub3 Marks");
        int Sub3 = sc.nextInt();
        System.out.println("Enter the Sub4 Marks");
        int Sub4 = sc.nextInt();
        System.out.println("Enter the Sub5 Marks");
        int Sub5 = sc.nextInt();
        marks = (Sub1 + Sub2 + Sub3 + Sub4 + Sub5) / 5;
        if (marks > 60) {
            System.out.println("He is passed");
        } else
            System.out.println("Otherwise he would failed");
    }
}