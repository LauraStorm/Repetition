package exercise6;
import java.util.ArrayList;
import java.util.Scanner;
/*
Exercise: 6
Write a program that constructs an arraylist containing the numbers 1 to 100, and prints them out.
The program ask the user for a number and remove all multiples of that number (except for the number itself) from the list.
Print the list again.
For example, if the user selects 5, it will remove 10, 15, 20, 25, 30, etc from the list.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create arrayList
        ArrayList<Integer> numbersFrom1To100 = new ArrayList<Integer>();

        //Add 1 to 100 in the arrayList
        for (int i = 1; i <= 100; i++) {
            numbersFrom1To100.add(i);
        }

        //Print ArrayList with the numbers 1 to 100
        System.out.println(numbersFrom1To100);

        //Ask user for a number to remove
        System.out.println("Please type a number and I will remove all multiples of that number: ");
        int inputNumber = scanner.nextInt();
        numbersFrom1To100.removeIf(number -> number !=  inputNumber && number % inputNumber == 0);

        //Print Arraylist after removing
        System.out.println(numbersFrom1To100);



    }
}
