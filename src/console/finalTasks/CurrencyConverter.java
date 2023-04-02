package console.finalTasks;

import java.text.DecimalFormat;

public class CurrencyConverter {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        System.out.println("Введите курс доллара: ");
        double exchangeRate = Double.parseDouble(System.console().readLine());
        System.out.println("Ведите количество рублей: ");
        double sum = Double.parseDouble(System.console().readLine());
        System.out.println("Сумма: " + df.format(sum / exchangeRate));
    }
}
