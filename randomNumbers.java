
import java.util.Random;
import java.util.Scanner;

class Randomnumbers {
    public static void main(String[] args) {
        System.out.println("Enter nth position");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random R = new Random();
        int numbers[] = new int[500];

        // generating 500 random numbers less than 9999 store to array numbers
        for (int count = 0; count < 500; count++) {
            numbers[count] = R.nextInt(9999);
        }

        // Sorting array using Bubble sort:
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int tmp = 0;
                if (numbers[i] > numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }

        // Printing sorted array
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);

        // Printing nth (array index =n-1) smallst number
        System.out.println(numbers[n - 1]);
    }
}
