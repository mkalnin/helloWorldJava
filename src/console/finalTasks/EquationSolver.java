package console.finalTasks;

public class EquationSolver {
    public static void main(String[] args) {
        System.out.println("Введите уравнение: ");
        String equation = System.console().readLine();
        String firstOperand = equation.substring(0,1);
        String operatorStr = equation.substring(1,2);
        String secondOperand = equation.substring(2,3);
        String resultant = equation.substring(4,5);
        double res = 0;

        if (resultant.equals("x")) {
            int first = Integer.parseInt(firstOperand);
            int second = Integer.parseInt(secondOperand);
            if (operatorStr.equals("+")) {
                res = first + second;
            }
            else if (operatorStr.equals("-")) {
                res = first - second;
            }
            else if (operatorStr.equals("*")) {
                res = first * second;
            }
            else {
                res = first / second;
            }
        }
        else {
            if (firstOperand.equals("x")) {
                int second = Integer.parseInt(secondOperand);
                int result = Integer.parseInt(resultant);
                if (operatorStr.equals("+")) {
                    res = result - second;
                }
                else if (operatorStr.equals("-")) {
                    res = result + second;
                }
                else if (operatorStr.equals("*")) {
                    res = result / second;
                }
                else {
                    res = result * second;
                }
            }
            else {
                int first = Integer.parseInt(firstOperand);
                int result = Integer.parseInt(resultant);
                if (operatorStr.equals("+")) {
                    res = result - first;
                }
                else if (operatorStr.equals("-")) {
                    res = first - result;
                }
                else if (operatorStr.equals("*")) {
                    res = result / first;
                }
                else {
                    res = first / result;
                }
            }
        }

        System.out.println("x=" + res);
    }
}
