package practice;

public class Parametrs {
//    //1 example
//    public static void main(String [] args) {
//        measureRectangle(2.5, 3.5);
//    }
//        public static void measureRectangle (double len, double wid) {
//            System.out.println(len   *  wid   );
//        }


    public static void main(String [] args) {
        measureRectangle(3.2, 4.1);
        measureRectangle(3.5, 1.2);
        measureRectangle(1.6, 5.6);
        measureRectangle(10.1, 0.7);
        measureRectangle(20.2, 5.6);
    }

    public static void measureRectangle(double lenght, double width) {
        double area = lenght * width;
        System.out.println("The are of the rectangle is " + area + "\n");
    }
}
