import java.util.*;

public class Main {
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
           
         int[] arr = new int[n];
            for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();
            }
       List<Integer> list =  findMajorityElements(arr,n );
       for(int el :list)
        System.out.print(el+" ");        
         
        System.out.println();
     }
     
     public static List<Integer> findMajorityElements(int[] arr, int N ){
          // write your code here
        // Step 1: Find potential candidates
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify the candidates
        List<Integer> result = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for (int num : arr) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        if (count1 > N / 3) result.add(candidate1);
        if (count2 > N / 3) result.add(candidate2);

        return result;
    }

}



