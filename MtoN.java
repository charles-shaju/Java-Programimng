import java.util.Scanner;

class RangeDisplay{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number (m): ");
        int m = sc.nextInt();
        
        System.out.print("Enter end number (n): ");
        int n = sc.nextInt();

        System.out.print("Output: ");

        // logic to handle both increasing (1 to 10) and decreasing (10 to 1)
        if (m <= n) {
            // Count UP
            while (m <= n) {
                System.out.print(m + " ");
                m++;
            }
        } else {
            // Count DOWN
            while (m >= n) {
                System.out.print(m + " ");
                m--;
            }
        }
        
        System.out.println(); // New line at the end
    }
}