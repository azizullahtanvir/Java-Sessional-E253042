import java.util.Scanner;

public class Lab3Task2PrimeNumbersArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int[] primeNumbers = new int[end - start + 1];
        int count = 0;
        for (int num = start; num <= end; num++) {

            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {

                for (int i = 2; i < num; i++) {

                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primeNumbers[count] = num;
                count++;
            }
        }

        System.out.println("Prime Numbers:");

        for (int i = 0; i < count; i++) {
            System.out.print(primeNumbers[i] + " ");
        }

        sc.close();
    }
}