package Viewer;


public class ConsoleView implements UserGUI {

    private Menu menu;

    public ConsoleView() {
        menu = new Menu();
    }

    public void calculatorMenu() {
        while (true) {
            System.out.println(menu.getMenu());
            inputFirstValue();
            inputSecondValue();
            switch (menu.setChoice()) {
                case "+":
                    break;
                case "-":
                    break;
                case "*":
                    break;
                case "/":
                    break;
                case "**":
                    break;
                default:
                    System.out.println("Неверно введена операция! Повторите ввод!");
            }
            return;
        }
    }

//    public int inputValue();

    @Override
    public void inputFirstValue() {
        System.out.print("Введите первое число: ");
    }

    @Override
    public void inputSecondValue() {
        System.out.print("Введите второе число: ");
    }

}
