package Viewer;

import java.util.Scanner;

public class Menu {

    private String menu;
    private Scanner in;
    private String choice;

    public Menu() {
        menu = """
                Выбирете операцию:
                1. "+" - сложить два числа;
                2. "-" - вычесть два числа;
                3. "*" - умножить два числа;
                4. "/" - разделить два числа;
                5  "**" - возвести в степень два числа;
                                
                """;

        in = new Scanner(System.in);

        choice = in.nextLine();
    }

    public String getMenu() {
        return menu;
    }

    public String getChoice() {
        return choice;
    }

    public String setChoice() {
        return choice = in.nextLine();

    }

    public int setValue(int number) {
        return number;
    }

    public double setValue(double number) {
        return number;
    }

}

