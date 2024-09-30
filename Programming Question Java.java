
Given an array for any index return the product of all other numbers.

[1,2,3,4,5] -> [120, 60, 40, 30, 24]

[1,2,0,4,5] -> [0, 0, 40, 0, 0]

[1,2,0,0,5] -> [0, 0, 0, 0, 0]




public class Test1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 0, 4, 5}; // example input
        int[] arr = new int[a.length];

        // First, we calculate the total product of non-zero elements
        int product = 1;
        int zeroCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroCount++;
            } else {
                product *= a[i];
            }
        }

        // Now we fill the output array based on the number of zeros
        for (int i = 0; i < a.length; i++) {
            if (zeroCount > 1) {
                // If there are more than one zero, all elements should be zero
                arr[i] = 0;
            } else if (zeroCount == 1) {
                // If there's exactly one zero, only the element at the zero's position
                // should be the product, others should be zero
                if (a[i] == 0) {
                    arr[i] = product;
                } else {
                    arr[i] = 0;
                }
            } else {
                // If there are no zeros, each element should be product divided by that element
                arr[i] = product / a[i];
            }
        }

        // Output the result
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}



SECOND APPROACH:

public class Test2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 0, 4, 5}; // example input
        int n = a.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        // Initialize the left array
        left[0] = 1; // No elements to the left of index 0
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }

        // Initialize the right array
        right[n - 1] = 1; // No elements to the right of the last index
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }

        // Multiply left and right arrays
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        // Output the result
        for (int k = 0; k < result.length; k++) {
            System.out.println(result[k]);
        }
    }
}


Create two arrays, left and right, where:

left[i] stores the product of all elements to the left of index i.
right[i] stores the product of all elements to the right of index i.
Multiply corresponding elements from the left and right arrays to get the final result.

Steps:
Initialize the left array where left[0] = 1 because there are no elements to the left of index 0.
Initialize the right array where right[n-1] = 1 because there are no elements to the right of index n-1.
Fill the left array by multiplying elements progressively from the left.
Fill the right array by multiplying elements progressively from the right.
Finally, multiply left[i] and right[i] to get the product of all elements except the current one at index i.

Explanation:
Left Array Calculation: left[i] stores the product of all elements to the left of i.

Example for input [1, 2, 0, 4, 5]:
left = [1, 1, 2, 0, 0] (left[i] is the product of elements to the left of a[i]).
Right Array Calculation: right[i] stores the product of all elements to the right of i.

Example for input [1, 2, 0, 4, 5]:
right = [0, 0, 20, 5, 1] (right[i] is the product of elements to the right of a[i]).
Final Output: Multiply left[i] and right[i] to get the result for each element.

Final result: [0, 0, 40, 0, 0] for the input array [1, 2, 0, 4, 5].
Time Complexity:
O(n) for calculating the left and right arrays.
O(n) for generating the final result array. Thus, the overall time complexity is O(n), and no division is used.

Memory Used:
Input Array (a): This array is already given as input, so it doesn't contribute to additional space complexity.

Left Array (left): This array of size n is used to store the products of elements to the left of each index.

Right Array (right): This array of size n is used to store the products of elements to the right of each index.

Result Array (result): This array of size n stores the final result.

Total Space:
You have n elements in the left array.
You have n elements in the right array.
You have n elements in the result array.
So the space complexity is: O(n)






