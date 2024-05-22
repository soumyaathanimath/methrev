package methrev;

public class Reverseee {

    public static void main(String[] args) {
        // Initialize an array with some values
        int[] array = {1, 2, 3, 4, 5};
        
        // Create an instance of Reverseee to call the non-static reverse method
        Reverseee reverseee = new Reverseee();
        
        // Reverse the array
        int[] reversedArray = reverseee.reverse(array);
        
        // Print the original array
        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    int[] reverse(int[] A) {
        int[] B = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }
        return B;
    }
}
