package SimpleAdditionUsingScanner;

import java.util.Scanner;

public class AdditionUsingScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");

        int number1 = sc.nextInt();

        System.out.println("Enter second Number");

        int number2= sc.nextInt();


        int sum = number1 + number2;

        System.out.println(sum);


    }
}
