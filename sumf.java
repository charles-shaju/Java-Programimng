import java.util.Scanner;

class FactorialSeriesSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0.0;
        double factorial = 1.0; 
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            double term = i / factorial;
            sum = sum + term;
        }

        System.out.println("The sum of the series is: " + sum);
    }
}