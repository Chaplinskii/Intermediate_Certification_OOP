package Calculator;

public class TransporterComplexNumbers {

    private String operation;
    private ComplexNumbers complexNumbers1;
    private ComplexNumbers complexNumbers2;
    private ComplexNumbers result;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ComplexNumbers getComplexNumbers1() {
        return complexNumbers1;
    }

    public void setComplexNumbers1(ComplexNumbers complexNumbers1) {
        this.complexNumbers1 = complexNumbers1;
    }

    public ComplexNumbers getComplexNumbers2() {
        return complexNumbers2;
    }

    public void setComplexNumbers2(ComplexNumbers complexNumbers2) {
        this.complexNumbers2 = complexNumbers2;
    }

    public ComplexNumbers getResult() {
        return result;
    }

    public void setResult(ComplexNumbers result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return complexNumbers1+" "+operation+" "+complexNumbers2+" = "+result;
    }
}
