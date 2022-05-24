package exercise.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList();
        /*
        *Created an object from IAddition interface and applied its method in order to define the sum operation.
        */
        IAddition sumOperation = (x, y) -> {
            Double sumResult = x+y;
            numbers.add(0, sumResult);
            System.out.println("Sum result is: " + sumResult);
        };
        /*
         *Created an object from ISubtraction interface and applied its method in order to define the subtraction equation.
         */
        ISubtraction subtractionOperation = (x, y) -> {
            Double subResult = x-y;
            numbers.add(1, subResult);
            System.out.println("Subtraction result is: " + subResult);
        };
        /*
         *Created an object from IMultiplication interface and applied its method in order to define the multiplication equation.
         */
        IMultiplication multiplicationOperation = (x, y) -> {
            Double multiplicationResult = x*y;
            numbers.add(2, multiplicationResult);
            System.out.println("Multiplication result is: " + multiplicationResult);
        };
        /*
         *Created an object from IDivision interface and applied its method in order to define the division equation.
         */
        IDivision divisionOperation = (x, y) -> {
            try {
                if (y == 0)
                    throw new ArithmeticException("Exception: divide by zero.\n");
                Double divisionResult = x/y;
                numbers.add(3, divisionResult);
                System.out.println("Division result is: " + divisionResult);
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        };
        sumOperation.calculateSum(3.0,5.0);
        subtractionOperation.calculateSubtraction(10.0,25.0);
    }
}

