import DataStructures.Array;
import DataStructures.LinkedList;
import SortingAlgos.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!"); //O(1) - Constant
        //TheBigO.TimeComplexity.demoPrintNumbers();
        //arrayOperations();
        //linkedListOperations();
        //bubbleSortArray();
        int[] nums = new int[] {64, 34, 25, 12, 22, 11, 90, 5};
    }

    public static void bubbleSortArray() {
        int[] numbers = new int[] {5, 4, 3, 2, 1};
        System.out.println("Array before sort : " + Arrays.toString(numbers));
        BubbleSort.sort(numbers);

        int[] numbers2 = new int[] {6, 1};
        System.out.println("Array before sort : " + Arrays.toString(numbers2));
        BubbleSort.sort(numbers2);

        int[] numbers3 = new int[] { };
        System.out.println("Array before sort : " + Arrays.toString(numbers3));
        BubbleSort.sort(numbers3);
    }

    private static void linkedListOperations() {
        var list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addMiddle(25, 3);

        list.printList(list);
    }

    public static void arrayOperations() {
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

        System.out.println("Removing and reset DataStructures.Array - ");
        numbers.removeAt(3);
        numbers.printNumbers();

        System.out.println("Index of a value in DataStructures.Array - ");
        System.out.println("index of 30 = " + numbers.indexOf(30));
        System.out.println("index of 100 = " + numbers.indexOf(100));
    }

}