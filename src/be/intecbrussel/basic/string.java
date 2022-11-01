package be.intecbrussel.basic;

public class string {
    public static void  main (String [] args) {
        String name = "Joey";

        String lastname = new String( "     de       Kort   ");

        String result01 = name.toUpperCase();
        System.out.println(result01);

        String result02 = name.toLowerCase();
        System.out.println(result02);

        String result03 = lastname.trim();
        System.out.println(lastname);
        System.out.println(result03);

        String age = "36";

        int resultLength = lastname.length();
        System.out.println("Lastname length: " + resultLength);

        String str01 = "";
        String str02 = " ";

        boolean resultIsBlank = str01.isBlank();
        System.out.println(resultIsBlank);

        boolean resultIsBlank2 = str02.isBlank();
        System.out.println(resultIsBlank2);

        boolean resultIsBlank3 = name.isBlank();
        System.out.println(resultIsBlank3);

        boolean resultIsEmpty = str02.isEmpty();
        System.out.println(resultIsEmpty);

        String resultReplace = name.replace('y', 'i');
        System.out.println(resultReplace);

        String hi = "Hello world";
        String resultReplace1 = hi.replace('l', 'k');
        System.out.println(resultReplace1);




    }
}
