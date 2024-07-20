import java.util.Scanner;

public class D2B {
    // Converting Decimal to Binary
    public static void main(String[] args) {
        int num, i = 0, count = 0;
        int[] binary = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = sc.nextInt();
        sc.close();
        if (num < 0) {
            System.out.println("Enter a positive number");
            return;
        }
        if (num == 0) {
            System.out.println("Binary of the given number is: 0");
            return;
        }
        while (num > 0) {
            binary[i] = num % 2;
            num = num / 2;
            i++;
            count++;
        }
        System.out.print("Binary of the given number is: ");
        for (i = count - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

    }
}