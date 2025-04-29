    // Method to access an element in the array
    public static void accessElement(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        System.out.println("Value at index " + index + ": " + array[index]);
    }
public class ArrayExceptionHandling {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            // Define an array of size 4
            int[] array = new int[4];
    //Filling Array with values
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }

            // Call a method that may throw an exception
            accessElement(array, 5);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index access
            System.out.println("Error: Index out of bounds. Attempted to access an index outside the valid range ." + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Program execution completed.");
        }
    }
}
