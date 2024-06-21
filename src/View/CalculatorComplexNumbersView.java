package View;

import Calculator.CalculatorComplexNumbersService;
import Calculator.ComplexNumbers;
import Calculator.TransporterComplexNumbers;

import java.util.List;
import java.util.Scanner;

public class CalculatorComplexNumbersView {
    private CalculatorComplexNumbersService calculatorComplexNumbersService = new CalculatorComplexNumbersService();
    private final List<String> validOperators = calculatorComplexNumbersService.getOperations();


    public void start() {
        while (true) {
            TransporterComplexNumbers transporterComplexNumbers1 = new TransporterComplexNumbers();
            ComplexNumbers complexNumbers1 = new ComplexNumbers();
            complexNumbers1.setRealPart(promptInt("Введите действительную часть первого комплексного числа:"));
            complexNumbers1.setImaginaryPart(promptInt("Введите мнимую часть первого комплексного числа:"));
            transporterComplexNumbers1.setComplexNumbers1(complexNumbers1);

            ComplexNumbers complexNumbers2 = new ComplexNumbers();
            complexNumbers2.setRealPart(promptInt("Введите действительную часть второго комплексного числа:"));
            complexNumbers2.setImaginaryPart(promptInt("Введите мнимую часть второго комплексного числа:"));
            transporterComplexNumbers1.setComplexNumbers2(complexNumbers2);
            transporterComplexNumbers1.setOperation(getOperator());
//            System.out.println(transporterComplexNumbers1);
            calculatorComplexNumbersService.calculate(transporterComplexNumbers1);
//            System.out.println(transporterComplexNumbers1);
        }
    }

    private String getOperator() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите необходимое действие (*, +, /, -, =) : ");
        String operator = in.nextLine();
        while (true) {
            if (isInvalidOperator(operator)) {
                System.err.println("Это действие не поддерживается. " + "Введите необходимое действие (*, +, /, -, =) : ");
                operator = in.nextLine();
            } else return operator;
        }
    }

    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }

    private double promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        double result = -1;
        try {
            result = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Вы ввели не число. Пожалуйста введите число");
            promptInt(message);
        }
        return result;
    }

}
