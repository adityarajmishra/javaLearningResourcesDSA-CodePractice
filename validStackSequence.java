import java.util.*;
class Main {

    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int [] arr1=new int[n];
            int [] arr2=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            System.out.println(validStackSequence(arr1,arr2,n));
        }
    }

    public static String validStackSequence(int[] pushed, int[] popped, int n) {
        Stack<Integer> stack = new Stack<>();
        int j = 0; // Pointer for the popped array

        // Simulate the stack operations
        for (int num : pushed) {
            stack.push(num); // Push elements from 'pushed' array
            // Check if the top of the stack matches the current popped element
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop(); // Pop the element
                j++; // Move to the next element in 'popped'
            }
        }

        // If all elements are popped successfully, return "YES"
        return stack.isEmpty() ? "YES" : "NO";
    }
}
