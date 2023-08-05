package model;

public class SimpleCalculator extends Calculator<Value> {

    @Override
    public Value summary(Value firstvalue, Value secondvalue) {
        if (firstvalue.getValue() instanceof Integer && secondvalue.getValue() instanceof Integer) {
            return new Value<>(firstvalue.getValue().intValue() + secondvalue.getValue().intValue());
        } else if (firstvalue.getValue() instanceof Double && secondvalue.getValue() instanceof Double) {
            return new Value<>(firstvalue.getValue().doubleValue() + secondvalue.getValue().doubleValue());
        }
        return null;
    }

    @Override
    public Value subtraction(Value firstvalue, Value secondvalue) {
        if (firstvalue.getValue() instanceof Integer && secondvalue.getValue() instanceof Integer) {
            return new Value<>(firstvalue.getValue().intValue() - secondvalue.getValue().intValue());
        } else if (firstvalue.getValue() instanceof Double && secondvalue.getValue() instanceof Double) {
            return new Value<>(firstvalue.getValue().doubleValue() - secondvalue.getValue().doubleValue());
        }
        return null;
    }


    @Override
    public Value multiply(Value firstvalue, Value secondvalue) {
        if (firstvalue.getValue() instanceof Integer && secondvalue.getValue() instanceof Integer) {
            return new Value<>(firstvalue.getValue().intValue() * secondvalue.getValue().intValue());
        } else if (firstvalue.getValue() instanceof Double && secondvalue.getValue() instanceof Double) {
            return new Value<>(firstvalue.getValue().doubleValue() * secondvalue.getValue().doubleValue());
        }
        return null;
    }

    @Override
    public Value division(Value firstvalue, Value secondvalue) {
        if (firstvalue.getValue() instanceof Integer && secondvalue.getValue() instanceof Integer && secondvalue.getValue().intValue() !=0) {
            return new Value<>(firstvalue.getValue().intValue() * secondvalue.getValue().intValue());
        } else if (firstvalue.getValue() instanceof Double && secondvalue.getValue() instanceof Double && secondvalue.getValue().doubleValue() != 0) {
            return new Value<>(firstvalue.getValue().doubleValue() * secondvalue.getValue().doubleValue());
        }
        return null;
    }


    @Override
    public Value exponentiation(Value firstvalue, Value secondvalue) {
        double result = Math.pow(firstvalue.getValue().doubleValue(), secondvalue.getValue().doubleValue());
        return new Value<> (result);
    }
}
