package presenter;

import model.ComplexValue;
import model.Model;
import model.Value;

public class Presenter {

    Model model;

    public Presenter() {
        model = new Model();
    }

    public ComplexValue summary(ComplexValue firstvalue, ComplexValue secondvalue) {
       return model.summary(firstvalue, secondvalue);
    }

    public ComplexValue multiply(ComplexValue firstvalue, ComplexValue secondValue) {
        return model.multiply(firstvalue, secondValue);
    }

    public  ComplexValue division(ComplexValue firstvalue, ComplexValue secondValue) {
        return model.division(firstvalue, secondValue);
    }

    public  Value subtraction(Value firstvalue, Value secondValue) {
        return model.subtraction(firstvalue, secondValue);
    }

    public  Value exponentiation(Value firstvalue, Value secondValue) {
        return model.exponent(firstvalue, secondValue);
    }

    public Value summary(Value firstvalue, Value secondvalue) {
        return model.summary(firstvalue, secondvalue);
    }

    public Value multiply(Value firstvalue, Value secondValue) {
        return model.multiply(firstvalue, secondValue);
    }

    public  Value division(Value firstvalue, Value secondValue) {
        return model.division(firstvalue, secondValue);
    }

    public  Value subtraction(Value firstvalue, Value secondValue) {
        return model.subtraction(firstvalue, secondValue);
    }

    public  Value exponentiation(Value firstvalue, Value secondValue) {
        return model.exponent(firstvalue, secondValue);
    }






}
