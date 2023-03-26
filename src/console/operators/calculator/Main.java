package console.operators.calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        double x = parseDouble();
        System.out.println("Введите второе число: ");
        double y = parseDouble();
        System.out.println("Введите действие (+, -, * или /)");
        String operator = System.console().readLine();
        switch (operator) {
            case ("+") -> System.out.println(x + y);
            case ("-") -> System.out.println(x - y);
            case ("*") -> System.out.println(x * y);
            case ("/") -> System.out.println(x / y);
            default -> System.out.println("Неверные параметры");
        }
    }

    private static double parseDouble()
    {
        String input = System.console().readLine();

        return Double.parseDouble(input);
    }
}
