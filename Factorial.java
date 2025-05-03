import java.util.Scanner;
public class Mavenproject2 {			    //24K-6066
public static void PositiveInteger(int number) throws IllegalArgumentException {if (number <= 0) {
throw new IllegalArgumentException("The number must be greater than 0.");}}
public static long Factorial(int n) throws ArithmeticException {
long result = 1; if (n>10){throw new 
ArithmeticException ("The integer should be less than 10");}
for (long i = 1; i <= n; i++) {
result *= i;}
return result;}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter a positive integer: ");
int number = scanner.nextInt();
PositiveInteger(number);
long factorial = Factorial(number);
System.out.println("The factorial of " + number + " is: " + factorial);} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());} finally {
// Always executed
System.out.println("Task 2 completed.");
scanner.close();}}}
