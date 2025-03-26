public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int first = 0, second = 1;
        
        System.out.print("First " + n + " Fibonacci numbers: ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");
            
            // Compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}