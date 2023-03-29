import java.util.Scanner;


public class App {

    static final Scanner inputScanner = new Scanner(System.in);

    //phase 6
    public static void main(String[] args) {    
        Calculator calc = new Calculator();

        while(true) {
            String action = getString("\nWhat calculation would you like to perform: \n add \n subtract \n multiply \n divide \n exit \n");

            if(action.equals("exit")){
                System.out.println("Goodbye!");
                break;
            }

            double num1 = getDouble("First number: ");
            double num2 = getDouble("Second number: ");

            if(action.equals("add")){
                System.out.println("\nAddition result: " + calc.add(num1, num2));
            } else if(action.equals("subtract")){
                System.out.println("\nSubtraction result: " + calc.subtract(num1, num2));
            } else if(action.equals("multiply")){
                System.out.println("\nMultiplication result: " + calc.multiply(num1, num2));
            } else if(action.equals("divide")){
                if(num2 == 0){
                    System.out.println("\nCannot divide by 0.");
                }else{
                    System.out.println("\nDivision result: " + calc.divide(num1, num2));
                }
            } else{
                System.out.println("\nThat is not a valid operation, try again.");
            }

        }

    }

//phase 2
    private static String  getString(String prompt){
        System.out.println(prompt);
        return inputScanner.nextLine();
    }
//phase 2
    private static double getDouble(String prompt){
        System.out.println(prompt);
        return Double.parseDouble(inputScanner.nextLine());
    }

    //phase 2
    // public static void main(String[] args) {
    //     String question = getString("What do you want?");
    //     System.out.println(question);
    //     Double number = getDouble("Hit me up with a number, bro:");
    //     System.out.println(number);
    // }

    //phase 3
    // public static void main(String[] args) {
    //     Double num1 = getDouble("Please provide the first value: ");
    //     Double num2 = getDouble("Please provide the second value: ");
    //     System.out.println(String.format("You want to add %.2f and %.2f.", num1, num2));

    // }
    //phase 2    
    
    //phase 4
    // public static void main(String[] args) {    
    //     Calculator calc = new Calculator();

    //     Double num1 = getDouble("First number: ");
    //     Double num2 = getDouble("Second number: ");
    //     System.out.println("The result is: " + calc.add(num1, num2));
    // }
    
    //phase 5
    // public static void main(String[] args) {    
    //     Calculator calc = new Calculator();

    //     Double num1 = getDouble("First number: ");
    //     Double num2 = getDouble("Second number: ");
    //     System.out.println("Addition: " + calc.add(num1, num2));
    //     System.out.println("Subtraction: " + calc.subtract(num1, num2));
    //     System.out.println("Multiplication: " + calc.multiply(num1, num2));
    //     System.out.println("Division: " + calc.divide(num1, num2));
    // }
}