package be.intecbrussel.exceptions3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        // Checked Exception(Compile time exception)
        // Unchecked Exception(Runtime exception)

        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {

        }
    }
}
