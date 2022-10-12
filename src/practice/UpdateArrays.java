package practice;

import java.util.Arrays;

public class UpdateArrays {
    public static void main(String[] args) {
        String[] menu = {"espresso", "ice coffee", "macchiato"};
        menu[2] = "latte";
        System.out.println(Arrays.toString(menu));
        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
            newMenu[3] = "black cofee";
            newMenu[4] = "irish cofee";
        }
        System.out.println(Arrays.toString(newMenu));

    }
}
