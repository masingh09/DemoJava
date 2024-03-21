public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!"); //O(1) - Constant
        //TimeComplexity.demoPrintNumbers();

        // Arrays
        Array numbers = new Array(3);
        System.out.println(numbers.arrayLength());
        System.out.println("count of values in array = " + numbers.getCount());
        numbers.printNumbers();

        // insert numbers
        System.out.println("Inserting items");
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.printNumbers();

        System.out.println("Removing and reset Array - ");
        numbers.removeAt(3);
        numbers.printNumbers();

        System.out.println("Index of a value in Array - ");
        System.out.println("index of 30 = " + numbers.indexOf(30));
        System.out.println("index of 100 = " + numbers.indexOf(100));
    }

}