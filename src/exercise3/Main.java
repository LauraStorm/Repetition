package exercise3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
Exercise 3:
Write a program that reads a file with n number of strings separated by linebreaks.
The program prints how many words are in the file
 */
public class Main {
    public static void main(String[] args) {
        //Arraylist to save the words from csv file
        ArrayList<String> wordsFromFile = new ArrayList<String>();

        //Read file and save words
        File wordFile = new File("resources/words.csv");

        try {
            Scanner sc = new Scanner(wordFile);

            while (sc.hasNextLine()){               //Keep doing it until there is no more lines (words to read)
                String line = sc.nextLine();        //get word from a line
                wordsFromFile.add(line);            //adds word to arrayList
            }

        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");
            e.printStackTrace();
        }

        //Print how many words there are in the file
        int numberOfWords = wordsFromFile.size();
        System.out.println("There is " + numberOfWords + " words in the csv file!");
    }



}
