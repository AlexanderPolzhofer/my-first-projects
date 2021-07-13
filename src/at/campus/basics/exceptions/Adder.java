package at.campus.basics.exceptions;

import at.campus.basics.exceptions.excpts.UnableToAddException;

public class Adder {

    public double addNumbers(double a, double b) throws UnableToAddException {
        double sum = a + b;

        if (sum == 0) {
            throw new UnableToAddException("Die Summe ist null.");
        }
        return sum;
    }

    public double dividedNumbers(double a, double b) {
        return a / b;
    }

}
