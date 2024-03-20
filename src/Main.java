public class Main {
    public static void main(String[] args) {
        //Time Complexity
        System.out.println("Hello and welcome!"); //O(1) - Constant
        printNumbersWithLoops();
        printNumbersWithNestedLoops();
    }

    private static void printNumbers() {
        // We avoid constants from final calculation
        // Overall time complexity = O(1 + n) = O(n)
        System.out.println("Hello and welcome!"); //O(1) - Constant
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = "+ i); // O(n) - Linear
        }
    }
    private static void printNumbersWithLoops() {
        // Overall time complexity = O(n + n) = O(n)
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = "+ i); // O(n) - Linear
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = "+ (i+5)); // O(n) - Linear
        }
    }

    private static void printNumbersWithNestedLoops() {
        // Overall time complexity = O(n * n) = O(n^2)
        for (int i = 1; i <= 5; i++) {
            for (int j=1; j<= 5; j++) {
                System.out.println("i + j = " + i+j); // O(n^2) - Quadratic
            }
        }

    }
}