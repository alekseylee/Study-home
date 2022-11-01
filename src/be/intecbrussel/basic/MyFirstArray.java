package be.intecbrussel.basic;

import java.util.Arrays;

public class MyFirstArray {
    public static void main(String[] args) {

//        int[] myArr = new int[5];
//        myArr[0] = 10;
//        myArr[1] = 20;
//        myArr[2] = 30;
//        myArr[3] = 40;
//        myArr[4] = 50;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

//        String[] name = {"John", "Joey","Alex", "Johan", "Jane"};
//        System.out.println(name.length);
//        System.out.println(name[3]);
//        double[] numbers = {10.0, 25.9};

//        double[] numbers = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8 ,9.9, 10.10};
//        for (int index = 0; index < numbers.length; index++) {
//            System.out.println(numbers[index]);
//        }

        int number[] = {1, 2, 3, 4, 5,6, 7,8,9,10};
        int sum = 0;
        for(int index = 0; index < number.length; index++) {
            sum += number[index];
        }
        System.out.println("Summary int is: " + sum);

        //2 solution
//        int result = Arrays.stream(number).sum();
//        System.out.println(result);

        double[] deciNumb = {10.5, 20.8, 33.45};
        double sum1 = 0;
        for(int index = 0; index < deciNumb.length; index++) {
            sum1 += deciNumb[index];
        }
        System.out.println("Summary int is: " + sum1);

//        double result2 = Arrays.stream(deciNumb).sum();
//        System.out.println(result2);

    }
}
