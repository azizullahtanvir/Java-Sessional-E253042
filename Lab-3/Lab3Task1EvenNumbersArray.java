import java.util.Scanner;

public class Lab3Task1EvenNumbersArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int[] evenNumbers = new int[end - start + 1];

        int count = 0;
        int i = start;

        while (i <= end) {

            if (i % 2 == 0) {
                evenNumbers[count] = i;
                count++;
            }
            i++;
        }

        System.out.println("Even Numbers:");

        int j = 0;

        do {
            if (j < count) {
                System.out.println(evenNumbers[j]);
            }
            j++;
        } while (j < count);

        sc.close();
    }
}