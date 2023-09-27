
public class Array {

    public static void main(String[] args) {

        // What is an array in Java?

        // An array is a container that holds data (values) of one single type.
        // To access the elements of an array, we use indices (index numbers).
        // Syntax: dataType[] arrayName = new dataType[arraySize];

        // Example: int[] myNum = {10, 20, 30, 40};

        int nums[] = {10, 20, 30, 40};
        int nums2[] = new int[4];
        // nums2[0] = 10;
        // nums2[1] = 20;
        // nums2[2] = 30;
        // nums2[3] = 100;

        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : nums2) {
            System.out.print(i + " ");
        }

        // if i dont initialize the array, it will print 0 for int, false for boolean, null for string
        System.out.println();
        for(int i= 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        // Multi-dimensional arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7 , 5 , 10} };
        // myNumbers will look like dimensions 2 x 4:
        // 1 2 3 4
        // 5 6 7 5 10

        // print 2d array
        for(int i = 0; i < myNumbers.length; i++) {
            for(int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }

        int myNums[][] = new int[2][3];
        myNums[0][0] = 10;
        myNums[0][1] = 20;
        myNums[1][0] = 40;
        myNums[1][1] = 50;

        // seetting the values of the 2d array using random numbers
        for(int i = 0; i < myNums.length; i++) {
            for(int j = 0; j < myNums[i].length; j++) {
                myNums[i][j] = (int)(Math.random() * 100); // 0 - 99
            }
        }

        for(int i = 0; i < myNums.length; i++) {
            for(int j = 0; j < myNums[i].length; j++) {
                System.out.print(myNums[i][j] + " ");
            }
            System.out.println();
        }

        // using for each loop
        for(int[] i : myNums) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Columns can be of different lengths
        // What are jagged arrays?
        // A jagged array is an array of arrays with different dimensions.
        // Syntax: dataType[][] arrayName = new dataType[rows][];
        // Example: int[][] myNumbers = new int[5][];

        int[][] newnums = new int[5][];
        newnums[0] = new int[2];
        newnums[1] = new int[4];
        newnums[2] = new int[6];
        newnums[3] = new int[8];
        newnums[3] = new int[4];
        newnums[4] = new int[30];

        System.out.println("Jagged Array: ");
        // Now it will look like : 
        
        for(int []i : newnums) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Disadvantages of arrays : 
        // 1. Size is fixed
        // 2. Cannot store different types of data
        // 3. Cannot grow its size dynamically

        // Can you change the size of an array after it has been initialized? Why or why not?
        // No, you cannot change the size of an array after it has been initialized. 
        // You must initialize a new array with the new size and copy over the contents of the old array.
        
    }
    
}
