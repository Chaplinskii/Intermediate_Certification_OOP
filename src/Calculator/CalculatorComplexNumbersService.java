package Calculator;

import Logger.Logger_;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorComplexNumbersService {
    private static Logger_ logger = new Logger_();
    private static Logger log = Logger.getLogger(Logger_.class.getName());
    private CalculatorComplexNumbers calculatorComplexNumbers = new CalculatorComplexNumbers();


    public List getOperations() {
        log.log(Level.INFO, "Point 3.1: the getOperations method is called");

        return calculatorComplexNumbers.addOperation();
    }

    public TransporterComplexNumbers calculate(TransporterComplexNumbers transporterComplexNumbers) {
        log.log(Level.INFO, "Point 3.2: the calculate method is called");

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
