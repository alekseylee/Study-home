package be.intecbrussel.readingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String path = separator+ "C:" +separator+ "Users" +separator+ "HP Omen" +separator+ "Desktop" +separator+ "Test.txt";
//        File file = new File(path);
//
//        Scanner scan = new Scanner(file);
//        while(scan.hasNextLine()) {
//            System.out.println(scan.nextLine());
//        }
//
//        scan.close();

        String separator = File.separator;
        String path = separator+ "C:" +separator+ "Users" +separator+ "HP Omen" +separator+ "Desktop" +separator+ "Test1.txt";
        File file2 = new File(path);

        Scanner scanner = new Scanner(file2);
        String line = scanner.nextLine();
        String[] numbersString = line.split( " ");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
