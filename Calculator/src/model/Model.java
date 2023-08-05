package model;

public class Model {

    private SimpleCalculator calculator;

    private ComplexCalculator complexcalculator;

    public Model() {
        calculator = new SimpleCalculator();
        complexcalculator = new ComplexCalculator();
    }

    public Value summary (Value firstvalue, Value secondvalue) {
        return calculator.summary(firstvalue, secondvalue);
    }

    public Value subtraction (Value firstvalue, Value secondvalue) {
        return calculator.subtraction(firstvalue, secondvalue);
    }

    public Value multiply (Value firstvalue, Value secondvalue) {
        return calculator.multiply(firstvalue, secondvalue);
    }

    public Value division (Value firstvalue, Value secondvalue) {
        return calculator.division(firstvalue, secondvalue);
    }

    public Value exponent (Value firstvalue, Value secondvalue) {
        return calculator.exponentiation(firstvalue, secondvalue);
    }

    public ComplexValue summary (ComplexValue firstvalue, ComplexValue secondvalue) {
        return complexcalculator.summary(firstvalue, secondvalue);
    }

    public ComplexValue subtraction (ComplexValue firstvalue, ComplexValue secondvalue) {
        return complexcalculator.subtraction(firstvalue, secondvalue);
    }

    public ComplexValue multiply (ComplexValue firstvalue, ComplexValue secondvalue) {
        return complexcalculator.multiply(firstvalue, secondvalue);
    }

    public ComplexValue division (ComplexValue firstvalue, ComplexValue secondvalue) {
        return complexcalculator.division(firstvalue, secondvalue);
    }

}