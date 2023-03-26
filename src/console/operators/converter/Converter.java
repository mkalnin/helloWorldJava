package console.operators.converter;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int type = Integer.parseInt(System.console().readLine());
        switch (type) {
            case 1 -> convertMass();
            case 2 -> convertLength();
            default -> System.out.println("Неверное значение.");
        }
    }

    private static void convertMass()
    {
        System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция");
        int measure = Integer.parseInt(System.console().readLine());
        int value = inputValue();
        switch (measure) {
            case 1 -> convertKg(value);
            case 2 -> convertPound(value);
            case 3 -> convertOunce(value);
            default -> System.out.println("Неверное значение.");
        }
    }

    private static void convertLength()
    {
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int measure = Integer.parseInt(System.console().readLine());
        int value = inputValue();
        switch (measure) {
            case 1 -> convertMeter(value);
            case 2 -> convertMile(value);
            case 3 -> convertYard(value);
            case 4 -> convertFeet(value);
            default -> System.out.println("Неверное значение.");
        }
    }

    private static void convertKg(int value)
    {
        System.out.println("Килограммы: " + value);
        System.out.println("Фунты: " + (value * 2.20462));
        System.out.println("Унции: " + (value * 35.274));
    }

    private static void convertPound(int value)
    {
        System.out.println("Килограммы: " + (value * 0.453592));
        System.out.println("Фунты: " + value);
        System.out.println("Унции: " + (value * 16));
    }

    private static void convertOunce(int value)
    {
        System.out.println("Килограммы: " + (value * 0.0283495));
        System.out.println("Фунты: " + (value * 0.062499949018125));
        System.out.println("Унции: " + (value * 1.09361));
    }

    private static void convertMeter(int value)
    {
        System.out.println("Метры: " + value);
        System.out.println("Мили: " + (value * 0.000621371));
        System.out.println("Ярды: " + (value * 1.09361));
        System.out.println("Футы: " + (value * 3.28084));
    }

    private static void convertMile(int value)
    {
        System.out.println("Метры: " + (value * 1609.34));
        System.out.println("Мили: " + value);
        System.out.println("Ярды: " + (value * 1760));
        System.out.println("Футы: " + (value * 5280));
    }

    private static void convertYard(int value)
    {
        System.out.println("Метры: " + (value * 0.9144));
        System.out.println("Мили: " + (value * 0.000568182));
        System.out.println("Ярды: " + value);
        System.out.println("Футы: " + (value * 3));
    }

    private static void convertFeet(int value)
    {
        System.out.println("Метры: " + value * 0.3048);
        System.out.println("Мили: " + (value * 0.000189394));
        System.out.println("Ярды: " + (value * 0.333333));
        System.out.println("Футы: " + value);
    }

    private static int inputValue()
    {
        System.out.println("Введите число");

        return Integer.parseInt(System.console().readLine());
    }
}
