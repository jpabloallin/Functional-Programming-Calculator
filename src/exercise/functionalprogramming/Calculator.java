package exercise.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Calculator {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList();
        /*
        *Created an object from IOperation interface and applied its method in order to define the sum operation.
        */
        IOperation sumOperation = (x,y) -> x+y;
        /*
         *Created an object from IOperation interface and applied its method in order to define the subtraction equation.
         */
        IOperation subtractionOperation = (x, y) -> x-y;
        /*
         *Created an object from IOperation interface and applied its method in order to define the multiplication equation.
         */
        IOperation multiplicationOperation = (a, b) ->
                DoubleStream
                        .iterate(a, n -> sumOperation.execute(0.0,a))
                        .limit(b.longValue()).reduce(0.0, Double::sum);
        /*
         *Created an object from IOperation interface and applied its method in order to define the division equation.
         */
        IOperation divisionOperation = (a, b) -> {
            try {
                if (b == 0)
                    throw new ArithmeticException("Exception: divide by zero.\n");
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            if (b < 0.0)
                a = a*-1;
            if (b < 0.0)
                b = b*-1;
            Double divisionResult = 0.0;
            while (a>=b) {
                a = subtractionOperation.execute(a,b);
                divisionResult++;
            }
            return divisionResult;
        };
        /*
        * Sent parameter values for each operator method.
        * Added returned results on my array of numbers.
        * Displayed operator results.
        * */
        Double sumResult = sumOperation.execute(60.2, 55.2);
        numbers.add(sumResult);
        System.out.println("Sum result is: " + sumResult);

        Double subtractionResult = subtractionOperation.execute(10.0,25.0);
        numbers.add(subtractionResult);
        System.out.println("\nSubtraction result is: " + subtractionResult);

        Double multiplicationResult = multiplicationOperation.execute(6.0,5.0);
        numbers.add(multiplicationResult);
        System.out.println("\nMultiplication result is: " + multiplicationResult);

        Double divisionResult = divisionOperation.execute(5.0,2.0);
        numbers.add(divisionResult);
        System.out.println("\nDivision result is: " + divisionResult);
        /*
        * Made some validations on my number array list.
        * */
        System.out.println("My array of numbers: ");
        numbers.stream().forEach(number -> System.out.println(number + " "));
        System.out.println("\nNumbers higher than 7: ");
        numbers.stream().filter(number -> number > 7).forEach(System.out::println);
        System.out.println("\nEven and Odd numbers: ");
        numbers.stream().map(number -> number % 2 == 0 ? number + " Even number": number + " Odd number").forEach(System.out::println);
        System.out.println("\nMax number from the array: " + numbers.stream().max(Double::compareTo).get());
    }
}

