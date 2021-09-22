import java.util.Arrays;

public class MyMain {
    // Arrays Basics Problem 1:
    // Write a method addArrays3() that takes two int arrays of size 3 as input,
    // and outputs an int array of size 3 that is the "sum" of the two arrays
    // (i.e. the first element in our outputted array is the sum of the first
    // elements in the two input arrays, and so on).
    // Example:
    //    int[] arr1 = {1, 3, 5};
    //    int[] arr2 = {2, 4, 6};
    //    int[] arr3 = addArrays3(arr1, arr2); // arr3 = [3, 7, 11]
    public static int[] addArrays3(int[] arr1, int[] arr2) {
        int arr3[] = {arr1[0]+arr2[0],arr1[1]+arr2[1],arr1[2] +arr2[2]};
        return arr3;

    }

    // Arrays Basics Problem 2:
    // Next, write a method average3() that takes an int array of size 3 as input,
    // and outputs a double array of size 3, where each element of that array is
    // equal to the average of the values in the inputted array.
    // Example:
    // int[] arr1 = {1, 3, 5};
    // double[] arr2 = average3(arr1); // arr2 = [3.0, 3.0, 3.0]
    public static double[] average3(int[] arr) {
        double average_num = (arr[0]+arr[1]+arr[2]);
        double avg = average_num/3;
        double arr2[] = {avg,avg,avg};
        return arr2;

    }

    // Iteration Problem 1:
    // Write a method sum() that takes an int array of any size as input,
    // and outputs the sum of all of the values in the array.
    // Example:
    // int[] nums = {1, 6, 2, 6, 8, 2, 3, 9, 3};
    // int x = sum(nums); // x = 40
    public static int sum(int[] arr) {
        int x = 0;
        for (int i = 1; i <= arr.length;i++){
            x = x + arr[i-1];
        }
        return x;
    }

    // Iteration Problem 2:
    // Next, write a method max() that takes an int array of any size as input,
    // and outputs the largest number in the array
    // Example:
    // int[] nums = {1, 6, 2, 6, 8, 2, 3, 9, 3};
    // int x = max(nums); // x = 9
    public static int max(int[] arr) {
        int x = Integer.MIN_VALUE;
        for (int i = 1; i<= arr.length; i++){
             int n = arr[i-1];
             if (n > x){
                 x = n;
             }
        }
        return x;
    }

    // Challenge Problem:
    // Write a method makeRandomArray() outputs an int array of random numbers.
    // The method takes three inputs: the first input corresponds to the desired
    // size of the array, the second input is the smallest number that may be generated
    // and the last input is the largest number that may be generated (inclusive)
    // Example:
    // makeRandomArray(10, 1, 5) => [4, 2, 3, 1, 5, 3, 4, 4, 1, 2]
    public static int[] makeRandomArray(int size, int lowest, int biggest) {
        int[] arr= new int[size];
        arr = new int[]{lowest, biggest};
        for (int i = 2; i <arr.length; i++){
            int x = (int) ((Math.random() *100) + lowest);


            }
        }

    }


    public static void main(String[] args) {
        System.out.println("addArrays3 Tests:");
        int[] z = addArrays3(new int[] {-1, 6, 3}, new int[] {7, -6, 12} );
        System.out.println(Arrays.toString(z)); // [6, 0, 15]

        System.out.println();
        System.out.println("average3 Tests:");
        double[] x = average3(new int[] {2, 4, 6});
        System.out.println(Arrays.toString(x)); // [4.0, 4.0, 4.0]

        double[] y = average3(new int[] {7, 3, 21});
        System.out.println(Arrays.toString(y)); // [10.333333333333334, 10.333333333333334, 10.333333333333334]

        System.out.println();
        System.out.println("sum Tests:");
        int[] nums = {1, 6, 2, 6, 8, 2, 3, 9, 3};
        int[] nums2 = {-1, -6, -2, -6, -8, -2, -3, -9, -3};
        System.out.println(sum(nums)); // 40
        System.out.println(sum(nums2)); // -40

        System.out.println();
        System.out.println("max Tests:");
        System.out.println(max(nums)); // 9
        System.out.println(max(nums2)); // -1

        System.out.println();
        System.out.println("makeRandomArray Tests:");
        System.out.println(Arrays.toString(makeRandomArray(10, 1, 5)));
        // random, but could be: [4, 2, 3, 1, 5, 3, 4, 4, 1, 2]
    }
}