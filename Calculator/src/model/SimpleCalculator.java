package model;

public class SimpleCalculator implements Calculator<Value> {

    @Override
    public Value summary(Value firstvalue, Value secondvalue) {
        return new Value(firstvalue.getValue() + secondvalue.getValue());
    }

    @Override
    public Value subtraction(Value firstvalue, Value secondvalue) {
        return new Value(firstvalue.getValue() - secondvalue.getValue());
    }


    @Override
    public Value multiply(Value firstvalue, Value secondvalue) {
        return new Value(firstvalue.getValue() * secondvalue.getValue());
    }

    @Override
    public Value division(Value firstvalue, Value secondvalue) {
        return new Value(firstvalue.getValue() / secondvalue.getValue());
    }

    @Override
    public Value exponentiation(Value firstvalue, Value secondvalue) {
        return new Value(Math.pow(firstvalue.getValue(), secondvalue.getValue()));
    }
}
