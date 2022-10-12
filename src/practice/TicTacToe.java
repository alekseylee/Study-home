package practice;

// Stray practice

import java.util.Scanner;

public class TicTacToe {
    static Scanner scan;

    public TicTacToe() {
    }

    public static void main(String[] var0) {
        System.out.println("\nLet's play tic tac toe");
        char[][] var1 = new char[][]{{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
        printBoard(var1);

        for(int var2 = 0; var2 < 9; ++var2) {
            int[] var3;
            if (var2 % 2 == 0) {
                System.out.println("Turn: X");
                var3 = askUser(var1);
                var1[var3[0]][var3[1]] = 'X';
                printBoard(var1);
            } else {
                System.out.println("Turn: O");
                var3 = askUser(var1);
                var1[var3[0]][var3[1]] = 'O';
                printBoard(var1);
            }

            if (checkWin(var1) == 3) {
                System.out.println("X wins!!");
                System.exit(0);
            } else if (checkWin(var1) == -3) {
                System.out.println("O wins!!");
                System.exit(0);
            } else if (var2 == 8) {
                System.out.println("It's a tie!");
            }
        }

        scan.close();
    }

    public static void printBoard(char[][] var0) {
        System.out.print("\n");

        for(int var1 = 0; var1 < var0.length; ++var1) {
            System.out.print("\t");

            for(int var2 = 0; var2 < var0[var1].length; ++var2) {
                System.out.print(var0[var1][var2] + " ");
            }

            System.out.print("\n\n");
        }

    }

    public static int[] askUser(char[][] var0) {
        System.out.print(" • pick a row and column number: ");
        int var1 = scan.nextInt();

        int var2;
        for(var2 = scan.nextInt(); var0[var1][var2] != '_'; var2 = scan.nextInt()) {
            System.out.print("Spot taken, try again: ");
            var1 = scan.nextInt();
        }

        return new int[]{var1, var2};
    }

    public static int checkWin(char[][] var0) {
        int var1 = 0;

        int var2;
        int var3;
        for(var2 = 0; var2 < var0.length; ++var2) {
            for(var3 = 0; var3 < var0[var2].length; ++var3) {
                if (var0[var2][var3] == 'X') {
                    ++var1;
                } else if (var0[var2][var3] == 'O') {
                    --var1;
                }

                if (var1 == 3 || var1 == -3) {
                    return var1;
                }
            }
        }

        var1 = 0;

        for(var2 = 0; var2 < 3; ++var2) {
            for(var3 = 0; var3 < var0.length; ++var3) {
                if (var0[var3][var2] == 'X') {
                    ++var1;
                } else if (var0[var3][var2] == 'O') {
                    --var1;
                }

                if (var1 == 3 || var1 == -3) {
                    return var1;
                }
            }
        }

        var1 = 0;
        var2 = 0;

        while(true) {
            if (var2 < 3) {
                if (var0[var2][var2] == 'X') {
                    ++var1;
                } else if (var0[var2][var2] == 'O') {
                    --var1;
                }

                if (var1 != 3 && var1 != -3) {
                    ++var2;
                    continue;
                }

                return var1;
            }

            var1 = 0;

            for(var2 = 0; var2 < 3; ++var2) {
                if (var0[var2][2 - var2] == 'X') {
                    ++var1;
                } else if (var0[var2][2 - var2] == 'O') {
                    --var1;
                }

                if (var1 == 3 || var1 == -3) {
                    return var1;
                }
            }

            return var1;
        }
    }

    static {
        scan = new Scanner(System.in);
    }
}
