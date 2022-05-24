package exercise.functionalprogramming;

public class Calculator {
    public static void main(String[] args) {
        /*
        *Created an object from IAddition interface and applied its method in order to define the sum operation.
        */
        IAddition sumOperation = (x, y) -> System.out.println("Sum result is: " + (x + y > 10 ?  x+y + "\nSum is higher than 10"  : x+y + "\nSum is lower than 10"));
        /*
         *Created an object from ISubtraction interface and applied its method in order to define the subtraction operation.
         */
        ISubtraction subtractionOperation = (x, y) -> System.out.println(("Subtraction result is: " + (x - y <0 ?  x-y + "\nResult is negative"  : x-y + "\nResult is positive")));

        sumOperation.calculateSum(3.0,5.0);
        subtractionOperation.calculateSubtraction(10.0,25.0);
    }
}

