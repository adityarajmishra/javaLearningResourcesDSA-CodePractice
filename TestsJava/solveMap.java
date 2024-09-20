import java.util.*;

public class Main
{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n ;i++){
           arr[i] = sc.nextInt();
        }
         System.out.println(solve(arr,n));
        
         
    }
    
    public static int solve(int[] arr, int n){              
    // write the missing code here
        Map<Integer, Integer> frequency = new HashMap<>();
        Set<Integer> seenDuplicates = new LinkedHashSet<>();
        Set<Integer> invalidDuplicates = new HashSet<>();
        
        // Count frequencies and detect duplicates
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = frequency.getOrDefault(num, 0) + 1;
            frequency.put(num, count);
            
            if (count == 2) { // Number becomes a duplicate
                if (invalidDuplicates.isEmpty() || !invalidDuplicates.contains(num)) {
                    seenDuplicates.add(num);
                }
            } else if (count > 2) { // Number is a duplicate again
                seenDuplicates.remove(num);
                invalidDuplicates.add(num);
            }
        }
        
        // Return the first valid duplicate or -1
        if (!seenDuplicates.isEmpty()) {
            return seenDuplicates.iterator().next();
        }
        
        return -1;
    }
}
