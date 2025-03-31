import java.util.Scanner;

public class Calculator
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueOperation = true;
    

        System.out.println("Welcome to the Java Calculator!");

        while (continueOperation)
        {
            System.out.print("Enter an operation (+,-,*, /, or exit): ");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit"))
            {
                System.out.println("Okay, goodbye!");
                break;
            }

            if(!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/"))
            {
                System.out.println("Invalid operation. Please enter one of the following: +,-,*,/");
                continue;
            }

            System.out.print("Eneter the first number: ");
            int num1 = scanner.nextInt();

            if (num1 < -1000 || num1 > 1000)
            {
                System.out.println("Error: please choose a number between -1000 and 1000.");
                scanner.nextLine();
                continue;
            }

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            if (num2 < -1000 || num2 > 1000)
            {
                System.out.println("Error: please choose a number between -1000 and 1000");
                scanner.nextLine();
                continue;
            }

            scanner.nextLine();

            int result = 0;
            boolean validOperation = true;

            switch (operation)
            {
                case "+":
                result = num1 + num2;
                break;

                case "-":
                result = num1 - num2;
                break;

                case "*":
                result = num1 * num2;
                break;

                case "/":
                if (num2 == 0)
                {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                
                else 
                {
                    result = num1 / num2;
                }
                break;
            }

            if (validOperation)
            {
                System.out.println("The result of " + num1 + " " + operation + " " + num2 + " " + "=" + " " + result);
            }

            System.out.print("Do you want to perform another operation? (yes/no): ");
            String answer = scanner.nextLine();


            if(continueOperation);
                if(continueOperation)
                {
                    continueOperation = true;
                }
                if(answer.equalsIgnoreCase("no"))
                {
                    System.out.println("Thank you for using the Java Calculator! Goodbye!");
                    continueOperation = false;
                }

        }

            scanner.close();
    }
}