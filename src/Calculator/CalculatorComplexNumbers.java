package Calculator;

import Logger.Logger_;
import Operations.Addition;
import Operations.Division;
import Operations.Multiplication;
import Operations.Subtraction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorComplexNumbers implements Addition, Subtraction, Multiplication, Division {
    private static Logger_ logger = new Logger_();
    private static Logger log = Logger.getLogger(Logger_.class.getName());

    private List<String> operation = new ArrayList();

    public List addOperation() {
        log.log(Level.INFO, "Point 4.1: the addOperation method is called");
        operation.addLast(Addition.operatorSymbol);
        operation.addLast(Division.operatorSymbol);
        operation.addLast(Multiplication.operatorSymbol);
        operation.addLast(Subtraction.operatorSymbol);
        operation.addLast("=");
        return operation;
    }

    @Override
    public void addition(TransporterComplexNumbers transporterComplexNumbers) {
        log.log(Level.INFO, "Point 4.2: the addition method is called");
        ComplexNumbers result = new ComplexNumbers();
        result.setRealPart(
                transporterComplexNumbers.getComplexNumbers1().getRealPart()
                        + transporterComplexNumbers.getComplexNumbers2().getImaginaryPart());
        result.setImaginaryPart(
                transporterComplexNumbers.getComplexNumbers1().getImaginaryPart()
                        + transporterComplexNumbers.getComplexNumbers2().getImaginaryPart());
        transporterComplexNumbers.setResult(result);

    }

    @Override
    public void division(TransporterComplexNumbers transporterComplexNumbers) {
        log.log(Level.INFO, "Point 4.3: the division method is called");
        ComplexNumbers result = new ComplexNumbers();
        result.setRealPart(
                transporterComplexNumbers.getComplexNumbers1().getRealPart()
                        - transporterComplexNumbers.getComplexNumbers2().getImaginaryPart());
        result.setImaginaryPart(
                transporterComplexNumbers.getComplexNumbers1().getImaginaryPart()
                        - transporterComplexNumbers.getComplexNumbers2().getImaginaryPart());
        transporterComplexNumbers.setResult(result);

    }

    @Override
    public void multiplication(TransporterComplexNumbers transporterComplexNumbers) {
        log.log(Level.INFO, "Point 4.4: the multiplication method is called");
        ComplexNumbers result = new ComplexNumbers();
        result.setRealPart(
                (transporterComplexNumbers.getComplexNumbers1().getRealPart()
                        * transporterComplexNumbers.getComplexNumbers2().getRealPart()
                        - transporterComplexNumbers.getComplexNumbers1().getImaginaryPart()
                        * transporterComplexNumbers.getComplexNumbers2().getImaginaryPart()));
        result.setImaginaryPart(
                (transporterComplexNumbers.getComplexNumbers1().getImaginaryPart()
                        * transporterComplexNumbers.getComplexNumbers2().getRealPart()
                        + transporterComplexNumbers.getComplexNumbers1().getRealPart()
                        * transporterComplexNumbers.getComplexNumbers2().getImaginaryPart()));

        transporterComplexNumbers.setResult(result);
    }

    @Override
    public void subtraction(TransporterComplexNumbers transporterComplexNumbers) {
        log.log(Level.INFO, "Point 4.5: the subtraction method is called");
        ComplexNumbers result = new ComplexNumbers();
        result.setRealPart(
                (transporterComplexNumbers.getComplexNumbers2().getRealPart()
                        * transporterComplexNumbers.getComplexNumbers1().getRealPart()
                        + transporterComplexNumbers.getComplexNumbers2().getImaginaryPart()
                        * transporterComplexNumbers.getComplexNumbers1().getImaginaryPart())
                        / (Math.pow(transporterComplexNumbers.getComplexNumbers2().getRealPart(), 2)
                        + Math.pow(transporterComplexNumbers.getComplexNumbers2().getImaginaryPart(), 2)));
        result.setImaginaryPart(
                (transporterComplexNumbers.getComplexNumbers2().getRealPart()
                        * transporterComplexNumbers.getComplexNumbers1().getImaginaryPart()
                        - transporterComplexNumbers.getComplexNumbers2().getImaginaryPart()
                        * transporterComplexNumbers.getComplexNumbers1().getRealPart())
                        / (Math.pow(transporterComplexNumbers.getComplexNumbers2().getRealPart(), 2)
                        + Math.pow(transporterComplexNumbers.getComplexNumbers2().getImaginaryPart(), 2)));

        transporterComplexNumbers.setResult(result);

    }
}
