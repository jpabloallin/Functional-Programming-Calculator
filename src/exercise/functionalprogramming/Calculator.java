package exercise.functionalprogramming;

public class Calculator {
    public static void main(String[] args) {
        /*
        *Created an object from IAddition interface and applied its method in order to define the sum operation.
        */
        IAddition sumOperation = (x, y) -> x+y;
        /*
         *Created an object from ISubtraction interface and applied its method in order to define the subtraction operation.
         */
        ISubtraction subtractionOperation = (x, y) -> x-y;

        System.out.println( sumOperation.calculateSum(10.0,5.0));
        System.out.println( subtractionOperation.calculateSubtraction(50.0,5.0));

//        System.out.println("Subtraction: " + operation.calculateSubtraction(8.0, 2.5));
//        System.out.println("Multiplication: " + operation.calculateMultiplication(2.0, 5.5));
//        System.out.println("Division: " + operation.calculateDivision(50.0, 3.0));
    }
}

