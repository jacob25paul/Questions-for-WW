import java.util.Random;
import java.util.Arrays; 
class Randomnumbers {
    public static void main(String[ ] args) {
        Random R = new Random();
        int number;
       int numbers[]=new int[500];
       
// generating 500 random numbers less than 9999
        for (int count=0;count<500;count++){
            number =R.nextInt(9999);
            numbers[count]=number;
        }

// Array sorting using Bubble sort:
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
    
//Printing sorted array 
          for(int i=0;i<numbers.length;i++)
          System.out.println(numbers[i]);
          
// Printing 4th (array index =4-1) smallest number
        System.out.println(numbers[3]);
    }
}