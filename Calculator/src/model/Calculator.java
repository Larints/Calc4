package model;

public abstract class Calculator<Value> {

    public abstract  Value summary(Value firstvalue, Value secondValue);

    public abstract Value multiply(Value firstvalue, Value secondValue);

    public abstract Value division(Value firstvalue, Value secondValue);

    public abstract Value subtraction(Value firstvalue, Value secondValue);

    public abstract Value exponentiation(Value firstvalue, Value secondValue);

}
