public class Mavenproject2 {
    // 24K-6066 
public static void Element(int[] array, int index) throws ArrayIndexOutOfBoundsException {
throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);}
public static void main(String[] args) {
int rollNumber = 6066; 
int] array = new int[rollNumber];
try {
System.out.println("Requested index is out of your Array size...");
Element(array, rollNumber);}
 catch (ArrayIndexOutOfBoundsException e) {
System.out.println(""+e.getMessage());}
finally {
// Always executed
System.out.println("Task 1 completed.");}}}
