package Calculator;

import java.text.Format;

public class ComplexNumbers {
    private double realPart;
    private double imaginaryPart;

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        if (imaginaryPart<0){
            return "("+realPart+""+imaginaryPart+"i)";
        }
        return "("+realPart+"+"+ imaginaryPart+"i)";
    }
}
