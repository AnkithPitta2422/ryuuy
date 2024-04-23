public class EvenNumbers {
    public static void main(String[] args) {
        int n = 10; // Number of even numbers to find
        System.out.println("First " + n + " even numbers:");
        printEvenNumbers(n);
    }

    public static void printEvenNumbers(int n) {
        int count = 0; // Counter for even numbers found
        int number = 1; // Start with 1

        // Loop until 'n' even numbers are found
        while (count < n) {
            // Check if the current number is even
            if (number % 2 == 0) {
                System.out.println(number); // Print the even number
                count++; // Increment the count of even numbers found
            }
            number++; // Move to the next number
        }
    }
}
