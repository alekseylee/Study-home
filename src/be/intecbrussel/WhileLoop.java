package be.intecbrussel;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        while (i < 6) {
            System.out.println("Hello World");
            i++;
        }

        do {
            System.out.println("Hello Belgium");
            i++;
        }
        while (i < 6);
    }
}
