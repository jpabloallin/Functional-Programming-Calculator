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
        ISubtraction subtractionOperation = (x, y) -> x-y;

        sumOperation.calculateSum(3.0,5.0);
        //System.out.println( subtractionOperation.calculateSubtraction(50.0,5.0));
    }
}

