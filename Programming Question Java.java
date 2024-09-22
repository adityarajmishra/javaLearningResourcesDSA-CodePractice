
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







