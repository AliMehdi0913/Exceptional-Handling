import java.util.Scanner;
public class Mavenproject2 {
    //24K-6066
    public static void Totaling(int calculated , int entered) throws ArithmeticException {
        if (calculated != entered){
            throw new ArithmeticException ("Entered Total Marks do not match the Calculated one. While actual total is: "+calculated);
        }
    }
    public static void validRange (int marks ) throws IllegalArgumentException {
     if (marks<0){
     throw new IllegalArgumentException("Marks cannot be in negative.");}   
    else if (marks>100){
    throw new IllegalArgumentException ("Marks cannot bee greater than 100");}}
    
    public static void ZeroException(int entered) throws ArithmeticException {
    if (entered == 0){
    throw new ArithmeticException ("Total could not be equal to zero.");}}
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int calculated = 0;
        try {
                    
            System.out.println("Enter marks for 5 subjects:");
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                validRange(marks[i]);
                calculated+= marks[i];
            }
                System.out.println("Enter the Total marks of all Subjects: ");
                int entered = scanner.nextInt();
                ZeroException(entered);
                Totaling(calculated, entered);
                
                float Average = entered/5;
                System.out.println("The Average Marks: "+Average);            
                }
        catch (IllegalArgumentException e){
               System.out.println("Input Error: "+ e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Error occur: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("An unexpeced error occur: "+e.getMessage());
        }
        finally{
            System.out.println("Process Completed.");
        }
        scanner.close();
    }}
