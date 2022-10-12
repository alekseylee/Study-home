package classwerk8;

import java.util.Arrays;
import java.util.OptionalDouble;



public class ArrayOefening {
    public static void main(String[] args) {

        //oefening 1
//        double[] number = {1.5, 2.5, 3,5};
//        char[] ch = {'a', 'b', 'c'};
//        System.out.println("Number is " + number[1] + " \nChar is " + ch[0]);

        //oefening 2
//        String[] menu = {"espresso", "ice coffee", "latte", "irish coffee", "black coffee"};
//        System.out.println(menu[1]);
//        System.out.println("The length of myArr is: " + menu.length);

        //oefening 3
//        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int result2 = Arrays.stream(my_array).sum();
//        System.out.println("result of sum is " + result2);
        //oefening 3(2part)
//        int sum = 0;
//        for (int i = 0; i < my_array.length; i++) {
//            sum += my_array[i];
//            System.out.println(sum);

        //oefening 4
//        String myString = "Hello Belgium!";
//        char[] charArray = myString.toCharArray();
//        for(char ch:charArray){
//
//            System.out.print( ch + " | " );
//        }


        //oefening 5
//        int number[] = {20, 30, 25, 35, -16, 60, -100};
//        int result = Arrays.stream(number).sum()/7;
//        System.out.println(result);

        //oefening 6
//        String myString = "Char Array!";
//        char[] charArray = myString.toCharArray();
//        for (int i = 0; i < myString.length(); i++) {
//            System.out.print("| " + i + " = " + charArray[i]);
//        }


        //oefening 7
//        String[] firstArray = {"Intec", "is", "the", "best!"};
//        String[] secondArray = {"C#", "is", "the", "worst!"};
//        System.out.println("Length of arrays same - " + (firstArray.length == secondArray.length));

        //oefening 8

//        double[] numbers = {1.1, 3.3, 4.4, 2.2, 9.9, 6.6, 7.7, 8.8, 13.13, 5.5, 11.11, 10.10, 12.12, 14.14, 15.15};
//        String[] letters = {"a", "b", "c", "d", "w", "f", "t", "h", "p", "o", "l", "k", "m", "n", "z"};
//
//        Arrays.sort(numbers);
//        System.out.println("\nThe sorted numbers are: ");
//        for (double num : numbers) {
//            System.out.print(num + " | ");
//        }
//
//        Arrays.sort(letters);
//        System.out.println("\nThe sorted letters are: ");
//        for (String let : letters) {
//            System.out.print(let + " ");
//        }

        //oefening 9

//        int[] myIntArray = {1, 2, 3, 4, 5};
//        int[] newArray = Arrays.copyOf(myIntArray, 10);
//        System.out.println("\nNew array newArray after modifications:");
//        for (int index = 0; index < newArray.length; index++) {
//            System.out.print(newArray[index] + " ");
//        }

        //oefening 10

        String[] myArray = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel",
                "Amsterdam"};
//        Arrays.sort(myArray);
        for (String let : myArray) {

            System.out.println("\nAfter sorted cities are: ");
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i] + " ");
            }
        }

    }
}




