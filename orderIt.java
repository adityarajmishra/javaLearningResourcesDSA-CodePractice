import java.util.*;


public class Main {
    // NOTE: Please do not modify this function
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr1 =  new int[n];
            int[] arr2 =  new int[n];         
            int temp;
            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
                
            }
            
            for(int i=0; i<n; i++){
                arr2[i] = sc.nextInt();
            }
            
            orderIt(n,arr1,arr2);

    }

    public static void orderIt(int n, int[] arr1, int[] arr2) {
        Queue<Integer> queue = new LinkedList<>();
        for (int num : arr1) {
            queue.add(num);
        }

        int time = 0;
        for (int i = 0; i < n; i++) {
            while (queue.peek() != arr2[i]) {
                // Move the front process to the back of the queue
                queue.add(queue.poll());
                time++;
            }
            // Execute the process
            queue.poll();
            time++;
        }

        System.out.println(time);
    }


}
