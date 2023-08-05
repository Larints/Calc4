package model;

public class ComplexCalculator extends Calculator<ComplexValue> {


    @Override
    public ComplexValue summary(ComplexValue firstvalue, ComplexValue secondvalue) {
        double newRealPart = firstvalue.getRealPart() + secondvalue.getRealPart();
        double newImaginaryPart = firstvalue.getImaginaryPart() + secondvalue.getImaginaryPart();
        return new ComplexValue(newRealPart, newImaginaryPart);
    }

    @Override
    public ComplexValue subtraction(ComplexValue firstvalue, ComplexValue secondvalue) {
        double newRealPart = firstvalue.getRealPart() - secondvalue.getRealPart();
        double newImaginaryPart = firstvalue.getImaginaryPart() - secondvalue.getImaginaryPart();
        return new ComplexValue(newRealPart, newImaginaryPart);
    }


    @Override
    public ComplexValue multiply(ComplexValue firstvalue, ComplexValue secondvalue) {
        double newRealPart = firstvalue.getRealPart() * secondvalue.getRealPart() -
                firstvalue.getImaginaryPart() * secondvalue.getImaginaryPart();
        double newImaginaryPart = firstvalue.getRealPart() * secondvalue.getImaginaryPart()
                + firstvalue.getImaginaryPart() * secondvalue.getRealPart();
        return new ComplexValue(newRealPart, newImaginaryPart);
    }

    @Override
    public ComplexValue division(ComplexValue firstvalue, ComplexValue secondValue) {
        double denominator = firstvalue.getRealPart() * secondValue.getRealPart() + secondValue.getImaginaryPart()
                * secondValue.getImaginaryPart();
        double newRealPart = (firstvalue.getRealPart() * secondValue.getRealPart()
                + firstvalue.getImaginaryPart() * secondValue.getImaginaryPart()) / denominator;
        double newImaginaryPart = (firstvalue.getImaginaryPart() * secondValue.getRealPart()
                - firstvalue.getRealPart() * secondValue.getImaginaryPart()) / denominator;
        return new ComplexValue(newRealPart, newImaginaryPart);
    }


    @Override
    public ComplexValue exponentiation(ComplexValue firstvalue, ComplexValue secondValue) {
        return null;
    }
}
