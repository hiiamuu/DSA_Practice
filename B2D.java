import java.util.Scanner;

//Convert Binary to Decimal
public class B2D {
    public static void main(String[] args) {
        int num,i=0,sum=0;
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
        while (num!=0){
            sum=sum + (int) Math.pow(2,i) * (num%10);
            num = num/10;
            i++;
        }
        System.out.println("Decimal Number is: " + sum);
    }
}