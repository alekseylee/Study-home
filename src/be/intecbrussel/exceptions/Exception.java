package be.intecbrussel.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args)  {
        //1
//        File file = new File("asdf");
//
//        try {
//            Scanner scanner = new Scanner(file);
//            System.out.println("After Scanner");
//
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }

        //2
        File file = new File("asdf");
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("aaat");
        Scanner scanner = new Scanner(file);



    }
}
