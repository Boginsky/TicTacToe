import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Random rand = new Random();
        boolean isGameOver = true;
        ArrayList standoff = new ArrayList();
        boolean isTrue1 = true;
        boolean isTrue = true;

        System.out.println("Game TicTacToe");
        String[][] strings = {{"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}};
        for (String[] ss : strings) {
            for (String s : ss) System.out.print(s + " ");
            System.out.println();
        }

        System.out.println("");
        System.out.println("*****************");
        System.out.println("");
        System.out.println("Number of cell");

        Integer[][] frameI = {{0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};

        for (Integer[] ii : frameI) {
            for (Integer i : ii) System.out.print(i + " ");
            System.out.println();
        }


        while (isGameOver) {
            System.out.println("");
            System.out.println("Enter the number of the cell");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();

            if (number > 8 || number < 0) {
                System.out.println("Вы ввели неверное число");
                System.out.println("Попробуйте снова");
                number = in.nextInt();
            }


            while (isTrue1)

                switch (number) {
                    case (0):
                        if (strings[0][0] == "X") {
                            System.out.println("Вы уже вводили это число. Попробуйте снова");
                            number = in.nextInt();

                        } else {
                            strings[0][0] = "X";
                            isTrue1 = false;
                            standoff.add(number);
                            break;
                        }
                    case (1):
                        if (strings[0][1] == "X") {
                            System.out.println("Вы уже вводили это число. Попробуйте снова");
                            number = in.nextInt();
                        } else {
                            strings[0][1] = "X";
                            isTrue1 = false;
                            standoff.add(number);
                            break;
                        }
                    case (2):
                        if (strings[0][2] == "X") {
                            System.out.println("Вы уже вводили это число. Попробуйте снова");
                            number = in.nextInt();
                        } else {
                            strings[0][2] = "X";
                            isTrue1 = false;
                            standoff.add(number);
                            break;
                        }
                    case (3):
                        if (strings[1][0] == "X") {
                            System.out.println("Вы уже вводили это число. Попробуйте снова");
                            number = in.nextInt();
                        } else {

                            strings[1][0] = "X";
                            isTrue1 = false;
                            standoff.add(number);
                            break;
                        }
                    case (4):
                        if (strings[1][1] == "X") {
                            System.out.println("Вы уже вводили это число. Попробуйте снова");
                            number = in.nextInt();
                        }else {
                            strings[1][1] = "X";
                            isTrue1 = false;
                            standoff.add(number);
                            break;
                        }
                    case (5):
                        if (strings[1][2] == "X") {
                            System.out.println("Вы уже вводили это число. Попробуйте снова");
                            number = in.nextInt();
                        }else {
                            strings[1][2] = "X";
                            isTrue1 = false;
                            standoff.add(number);
                            break;
                        }
                    case (6):
                        if (strings[2][0] == "X") {
                            System.out.println("Вы уже вводили это число. Попробуйте снова");
                            number = in.nextInt();
                        }else {
                            strings[2][0] = "X";
                            isTrue1 = false;
                            standoff.add(number);
                            break;
                        }
                    case (7):
                        if (strings[2][1] == "X") {
                            System.out.println("Вы уже вводили это число. Попробуйте снова");
                            number = in.nextInt();
                        }else {
                            strings[2][1] = "X";
                            isTrue1 = false;
                            standoff.add(number);
                            break;
                        }
                    case (8):
                        if (strings[2][2] == "X") {
                            System.out.println("Вы уже вводили это число. Попробуйте снова");
                            number = in.nextInt();
                        }else {
                            strings[2][2] = "X";
                            isTrue1 = false;
                            standoff.add(number);
                            break;
                        }
                }

            if (standoff.size() == 5) {

            } else {
                while (isTrue) {

                    int n = rand.nextInt(8);
                    if (n == number) {
                        n = rand.nextInt(8);
                    } else {

                        switch (n) {
                            case (0):
                                if (strings[0][0] != "_") {
                                    n = rand.nextInt(8);
                                } else {
                                    strings[0][0] = "0";
                                    isTrue = false;
                                    break;
                                }
                            case (1):
                                if (strings[0][1] != "_") {
                                    n = rand.nextInt(8);
                                } else {
                                    strings[0][1] = "0";
                                    isTrue = false;
                                    break;
                                }
                            case (2):
                                if (strings[0][2] != "_") {
                                    n = rand.nextInt(8);
                                } else {
                                    strings[0][2] = "0";
                                    isTrue = false;
                                    break;
                                }
                            case (3):
                                if (strings[1][0] != "_") {
                                    n = rand.nextInt(8);
                                } else {
                                    strings[1][0] = "0";
                                    isTrue = false;
                                    break;
                                }
                            case (4):
                                if (strings[1][1] != "_") {
                                    n = rand.nextInt(8);
                                } else {
                                    strings[1][1] = "0";
                                    isTrue = false;
                                    break;
                                }
                            case (5):
                                if (strings[1][2] != "_") {
                                    n = rand.nextInt(8);
                                } else {
                                    strings[1][2] = "0";
                                    isTrue = false;
                                    break;
                                }
                            case (6):
                                if (strings[2][0] != "_") {
                                    n = rand.nextInt(8);
                                } else {
                                    strings[2][0] = "0";
                                    isTrue = false;
                                    break;
                                }
                            case (7):
                                if (strings[2][1] != "_") {
                                    n = rand.nextInt(8);
                                } else {
                                    strings[2][1] = "0";
                                    isTrue = false;
                                    break;
                                }
                            case (8):
                                if (strings[2][2] != "_") {
                                    n = rand.nextInt(8);
                                } else {
                                    strings[2][2] = "0";
                                    isTrue = false;
                                    break;
                                }
                        }
                    }
                }
            }


            for (String[] ss : strings) {
                for (String s : ss) System.out.print(s + " ");
                System.out.println();
            }

            isTrue = true;
            isTrue1 = true;

            if (strings[0][0] == "X" && strings[0][1] == "X" && strings[0][2] == "X") {
                System.out.println("You won");
                isGameOver = false;
            } else if (strings[1][0] == "X" && strings[1][1] == "X" && strings[1][2] == "X") {
                System.out.println("You won");
                isGameOver = false;
            } else if (strings[2][0] == "X" && strings[2][1] == "X" && strings[2][2] == "X") {
                System.out.println("You won");
                isGameOver = false;
            } else if (strings[0][0] == "X" && strings[1][0] == "X" && strings[2][0] == "X") {
                System.out.println("You won");
                isGameOver = false;
            } else if (strings[0][1] == "X" && strings[1][1] == "X" && strings[2][1] == "X") {
                System.out.println("You won");
                isGameOver = false;
            } else if (strings[0][2] == "X" && strings[1][2] == "X" && strings[2][2] == "X") {
                System.out.println("You won");
                isGameOver = false;
            } else if (strings[0][0] == "X" && strings[1][1] == "X" && strings[2][2] == "X") {
                System.out.println("You won");
                isGameOver = false;
            } else if (strings[2][0] == "X" && strings[1][1] == "X" && strings[0][2] == "X") {
                System.out.println("You won");
                isGameOver = false;
            } else if (standoff.size() == 5) {
                System.out.println("Ничья");
            }


            if (strings[0][0] == "0" && strings[0][1] == "0" && strings[0][2] == "0") {
                System.out.println("You lose");
                isGameOver = false;
            } else if (strings[1][0] == "0" && strings[1][1] == "0" && strings[1][2] == "0") {
                System.out.println("You lose");
                isGameOver = false;
            } else if (strings[2][0] == "0" && strings[2][1] == "0" && strings[2][2] == "0") {
                System.out.println("You lose");
                isGameOver = false;
            } else if (strings[0][0] == "0" && strings[1][0] == "0" && strings[2][0] == "0") {
                System.out.println("You lose");
                isGameOver = false;
            } else if (strings[0][1] == "0" && strings[1][1] == "0" && strings[2][1] == "0") {
                System.out.println("You lose");
                isGameOver = false;
            } else if (strings[0][2] == "0" && strings[1][2] == "0" && strings[2][2] == "0") {
                System.out.println("You lose");
                isGameOver = false;
            } else if (strings[0][0] == "0" && strings[1][1] == "0" && strings[2][2] == "0") {
                System.out.println("You lose");
                isGameOver = false;
            } else if (strings[2][0] == "0" && strings[1][1] == "0" && strings[0][2] == "0") {
                System.out.println("You lose");
                isGameOver = false;
            }


        }
    }

}
