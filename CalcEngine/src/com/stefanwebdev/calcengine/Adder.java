package com.stefanwebdev.calcengine;

/**
 * Created by stefanvlahov on 1/21/17.
 */
public class Adder extends CalculateBase {
    public Adder() {}
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
