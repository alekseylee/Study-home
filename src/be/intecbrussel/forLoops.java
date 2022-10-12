package be.intecbrussel;


import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1-100");
        int nummer = scan.nextInt();
        int enterNummer = 0;
        for (nummer = nummer; nummer < 100; nummer += 2) {
            System.out.println("Even nummer: " + nummer);


        }
    }
}
