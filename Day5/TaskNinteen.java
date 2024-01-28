import java.util.Scanner;

public class TaskNinteen {

    // function to return max amount of water container can store
    static int maxWaterTrap(int[] arr, int length) {
        int left = 0;  // taking left iterator to traverse from left
        int right = length - 1;  // taking right iterator from last as right
        int maxTrap = 0;  // max_water variable will store the maximum water

        while (left < right) {  // condition working from left to right
            maxTrap = Math.max(maxTrap, Math.min(arr[left], arr[right]) * (right - left));  // calculating the max trap container can store

            if (arr[left] > arr[right]) {
                right = right - 1;  // we want max water hence neglecting the smaller one
            } else {
                left = left + 1;  // for max water moving the iterator
            }
        }

        return maxTrap;  // return the max_trap water
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Length of the Array:");
        int length = scanner.nextInt();  // user enters array length

        int[] arr = new int[length];  // array for storing the elements

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Maximum water that can be trapped = " + maxWaterTrap(arr, length));

        // this function will return the max amount of water container can store
    }
}

