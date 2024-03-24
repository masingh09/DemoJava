package TheBigO;

public class TimeComplexity {
    // A demo class to understand calculation of time complexity
    public static void demoPrintNumbers() {
        System.out.println("Hello and welcome to learning time complexity !"); //O(1) - Constant
        printNumbers(); // O(n)
        printNumbersWithLoops(); //O(n)
        printNumbersWithNestedLoops(); //O(n^2)
    }
    private static void printNumbers() {
        // We avoid constants from final calculation
        // Overall time complexity = O(1 + n) = O(n)
        System.out.println("Printing Numbers using a loop = O(n) n=size of iteration ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = "+ i); // O(n) - Linear
        }
    }
    private static void printNumbersWithLoops() {
        // Overall time complexity = O(1+ n + n) = O(1+2n) = O(n)
        System.out.println("Printing numbers from separate loops = O(n + m) = O(n)");
        System.out.println("First loop = O(n)");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = "+ i); // O(n) - Linear
        }
        System.out.println("Second loop = O(m)");
        for (int j = 1; j <= 10; j++) {
            System.out.println("j = "+ (j+5)); // O(n) - Linear
        }
    }

    private static void printNumbersWithNestedLoops() {
        // Overall time complexity = O(n * n) = O(n^2)
        System.out.println("Printing numbers from nested loops = O(n *n) = O(n^2)");
        for (int i = 1; i <= 5; i++) {
            for (int j=1; j<= 5; j++) {
                System.out.println("i + j = " + (i+j)); // O(n^2) - Quadratic
            }
        }

    }
}
