import java.util.InputMismatchException;
import java.util.Scanner;
public class Mavenproject2 {
    public static int WrongInput(Scanner scanner, String message) throws InputMismatchException {System.out.print(message);
if (!scanner.hasNextInt()) {
throw new InputMismatchException("Input must be an integer.");}
return scanner.nextInt();}
public static int divide(int a, int b) throws ArithmeticException {
if (b == 0) {
throw new ArithmeticException("Cannot divide by zero.");}
return a / b;}
public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
try {
int num1 = WrongInput(scanner, "Enter first number: ");
int num2 = WrongInput(scanner, "Enter second number: ");
int result = divide(num1, num2);
System.out.println("Result: " + result);} catch (InputMismatchException e) {
            System.out.println("Invalid Input: " + e.getMessage());
}catch (ArithmeticException e) {           System.out.println("Arithmetic Error: " + e.getMessage());
} catch (Exception e) {           System.out.println("Unexpected Error: " + e.getMessage());} finally {         System.out.println("Program Completed.");
scanner.close();}}}
