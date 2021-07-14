package at.campus.basics.exceptions;

import at.campus.basics.exceptions.excpts.UnableToAddException;

public class TestAdder {
    public static void main(String[] args) throws UnableToAddException {
        Adder adder = new Adder();

        try {
            double sum = adder.addNumbers(5, -5);
            double ratio = adder.dividedNumbers(81.9875, 4.45773);
            System.out.println("The sum is: " + sum);
            System.out.println("The ratio is: " + ratio);
        } catch (UnableToAddException utae) {
            utae.printStackTrace();
            System.out.println("The system is actual unavailable. " + utae.getMessage());
        }
    }
}
