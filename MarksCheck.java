import java.util.Scanner;

class MarksCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte m1 , m2 , m3;
        System.out.println("Enter marks of Physics");
        m1 = sc.nextByte();
        System.out.println("Enter marks of Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter marks of Mathematics");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations! You have passed the exam.");
        } else {
            System.out.println("Sorry! You have failed the exam.");
        }
    }
}