package question1;
import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int x = scanner.nextInt();
        int[] numbers = new int[x];
        for (int i = 0; i <= x - 1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int searchNumber = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= x - 1; i++) {
            if (numbers[i] == searchNumber) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("the number " + searchNumber + " is present "+count+ " time");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }
    }
}
