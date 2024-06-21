package Calculator;

import Operations.Addition;
import Operations.Division;
import Operations.Multiplication;
import Operations.Subtraction;

import java.util.ArrayList;
import java.util.List;

public class CalculatorComplexNumbers implements Addition, Subtraction, Multiplication, Division {

    private List<String> operation = new ArrayList();

    public List addOperation() {
        operation.addLast(Addition.operatorSymbol);
        operation.addLast(Division.operatorSymbol);
        operation.addLast(Multiplication.operatorSymbol);
        operation.addLast(Subtraction.operatorSymbol);
        operation.addLast("=");
        return operation;
    }

    @Override
    public void addition(TransporterComplexNumbers transporterComplexNumbers) {
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
//        result.setRealPart(
//                (transporterComplexNumbers.getComplexNumbers1().getRealPart()
//                        * transporterComplexNumbers.getComplexNumbers2().getRealPart()
//                        + transporterComplexNumbers.getComplexNumbers1().getImaginaryPart()
//                        * transporterComplexNumbers.getComplexNumbers2().getImaginaryPart())
//                        / ((Math.pow(transporterComplexNumbers.getComplexNumbers2().getRealPart(), 2))
//                        + (Math.pow(transporterComplexNumbers.getComplexNumbers2().getImaginaryPart(), 2))));
//        result.setImaginaryPart(
//                (transporterComplexNumbers.getComplexNumbers2().getRealPart()
//                        * transporterComplexNumbers.getComplexNumbers1().getImaginaryPart()
//                        - transporterComplexNumbers.getComplexNumbers1().getRealPart()
//                        * transporterComplexNumbers.getComplexNumbers2().getImaginaryPart())
//                        / ((Math.pow(transporterComplexNumbers.getComplexNumbers2().getRealPart(), 2))
//                        + (Math.pow(transporterComplexNumbers.getComplexNumbers2().getImaginaryPart(), 2))));
        transporterComplexNumbers.setResult(result);

    }
}
