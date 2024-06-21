package Calculator;

import java.util.List;

public class CalculatorComplexNumbersService {
    private CalculatorComplexNumbers calculatorComplexNumbers = new CalculatorComplexNumbers();


    public List getOperations() {

        return calculatorComplexNumbers.addOperation();
    }

    public TransporterComplexNumbers calculate(TransporterComplexNumbers transporterComplexNumbers) {

        if (transporterComplexNumbers.getOperation().equals("+")) {
            calculatorComplexNumbers.addition(transporterComplexNumbers);
            System.out.println(transporterComplexNumbers);

        } else if (transporterComplexNumbers.getOperation().equals("-")) {
            calculatorComplexNumbers.division(transporterComplexNumbers);
            System.out.println(transporterComplexNumbers);
        } else if (transporterComplexNumbers.getOperation().equals("*")) {
            calculatorComplexNumbers.multiplication(transporterComplexNumbers);
            System.out.println(transporterComplexNumbers);
        } else if (transporterComplexNumbers.getOperation().equals("/")) {
            calculatorComplexNumbers.subtraction(transporterComplexNumbers);
            System.out.println(transporterComplexNumbers);
        } else if (transporterComplexNumbers.getOperation().equals("=")) {
            transporterComplexNumbers.setOperation("+");
            calculatorComplexNumbers.addition(transporterComplexNumbers);
            System.out.println(transporterComplexNumbers);
            transporterComplexNumbers.setOperation("-");
            calculatorComplexNumbers.division(transporterComplexNumbers);
            System.out.println(transporterComplexNumbers);
            transporterComplexNumbers.setOperation("*");
            calculatorComplexNumbers.multiplication(transporterComplexNumbers);
            System.out.println(transporterComplexNumbers);
            transporterComplexNumbers.setOperation("/");
            calculatorComplexNumbers.subtraction(transporterComplexNumbers);
            System.out.println(transporterComplexNumbers);
        }

        return transporterComplexNumbers;
    }
}
