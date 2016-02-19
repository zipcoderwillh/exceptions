/**
 * Created by willhorton on 2/19/16.
 */
public class Calculator {

    public static int add(int first, int second) {

        int result = 0;
        result = first + second;
        return result;

    }

    public static int subtract(int first, int second) {

        int result = 0;
        result = first - second;
        return result;

    }

    public static int multiply(int first, int second) {

        int result = 0;
        result = first * second;
        return result;

    }

    public static int divide(int first, int second) throws DivisionByZeroException {

        if(second == 0) {
            throw new DivisionByZeroException("Don't divide by zero!!!");
        }

        int result = 0;
        result = first / second;
        return result;

    }

}
