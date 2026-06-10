import java.util.Scanner;

public class PercentageConvertor {
    public static void main(String[] args) {
        float total = 0;
        System.out.println("Welcome to the percentage convertor");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total marks of the subject :");
        int total_marks = input.nextInt();
        System.out.println("Enter marks of subject 1 :");
        float s1 = input.nextFloat();
        total = total + s1;
        System.out.println("Enter marks of subject 2 :");
        float s2 = input.nextFloat();
        total = total + s2;
        System.out.println("Enter marks of subject 3 :");
        float s3 = input.nextFloat();
        total = total + s3;
        System.out.println("Enter marks of subject 4 :");
        float s4 = input.nextFloat();
        total = total + s4;
        System.out.println("Enter marks of subject 5 :");
        float s5 = input.nextFloat();
        total = total + s5;
        float grandTotal = total * 100 / (total_marks * 5);
        System.out.println("Your total percentage = " + grandTotal + "Percentage");
    }
}