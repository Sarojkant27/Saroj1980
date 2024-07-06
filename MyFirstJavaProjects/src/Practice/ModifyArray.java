package Practice;

public class ModifyArray {
    public static void main(String[] args) {
        // Input array
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        
        // Modify the array to get the desired output
        int[] outputArray = modifyArray(inputArray);
        
        // Print the output array
        System.out.print("Output array: {");
        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(outputArray[i]);
            if (i < outputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] modifyArray(int[] array) {
        // Create a new array to store the modified values
        int[] modifiedArray = new int[array.length + 1];
        
        // Copy the original array up to the 4th index
        for (int i = 0; i < 4; i++) {
            modifiedArray[i] = array[i];
        }
        
        // Insert 10 at the 5th position
        modifiedArray[4] = 10;

        // Insert 0 at the 6th position
        modifiedArray[5] = 0;

        // Copy the rest of the original array after the inserted elements
        for (int i = 4; i < array.length; i++) {
            modifiedArray[i + 2] = array[i];
        }
        
        return modifiedArray;
    }
}