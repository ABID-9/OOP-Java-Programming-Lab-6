import java.util.Scanner;

public class average {

    static int average(int a, int b, int c) {
       return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int a = input.nextInt();

        System.out.print("Input the second number: ");
        int b = input.nextInt();

        System.out.print("Input the third number: ");
        int c = input.nextInt();

        System.out.println("The average value is " + average(a, b, c));
    }
}