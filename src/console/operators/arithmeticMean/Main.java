package console.operators.arithmeticMean;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите x:");
        double x = parseDouble();
        System.out.println("Введите y:");
        double y = parseDouble();
        System.out.println("Введите z:");
        double z = parseDouble();

        double arithmeticMean = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + arithmeticMean);;
        int halfOfArithmeticMean = (int) (arithmeticMean / 2);

        if (halfOfArithmeticMean > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }

    private static double parseDouble()
    {
        String input = System.console().readLine();

        return Double.parseDouble(input);
    }
}
