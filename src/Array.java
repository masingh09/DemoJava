public class Array {

    private int[] numbers;

    private int count;

    public Array(int size) {
        this.numbers = new int[size];
        this.count = 0;
    }

    // A java class with methods for Array Operations
    public void insert(int item) {
        //Time complexity = O(n)
        if (isArrayFull(numbers)) {
            //Space complexity = O(1) + O(n) = O(n)
            // create a new array say double the size
            int[] newNumbers = new int[count * 2];

            //copy old array items to new array
            for (int i = 0; i < count; i++) {
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }

        numbers[count] = item;
        count++;
    }

    public  void removeAt(int index) {
        // validate the index
        if (index > -1 && index<= count) {
            // value at last index
            if (index == count-1) {
                //TC = O(1)
                //SC = O(1)
                numbers[index] = 0;
            } else {
                //TC = O(n)
                //SC = O(1)

                // remove the value at index
                numbers[index] = 0;

                // shift numbers to the left side to fill the empty space
                for (int i=index; i<=count-2; i++) {
                    numbers[i] = numbers[i+1];
                }
                count--;
            }
        }
    }

    public int getCount() {
        return count;
    }

    public void printNumbers() {
        // TC = O(n)
        // SC = O(1)
        System.out.println("Numbers in the array : - ");
        for (int i=0; i<count; i++) {
            System.out.println(numbers[i]);
        }
    }

    public int arrayLength() {
        return numbers.length;
    }

    public int indexOf(int val) {
        for (int i=0; i<count; i++) {
            if (numbers[i] == val) {
                return i;
            }
        }
        return -1;
    }

    private boolean isArrayFull(int[] numbers) {
        return numbers.length == count;
    }

}
