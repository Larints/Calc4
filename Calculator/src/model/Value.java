package model;

public class Value<T extends Number> {

    private T value;

    public Value(T value) {
        this.value = value;
    }

    protected Value() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
