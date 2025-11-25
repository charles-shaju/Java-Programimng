import java.util.Scanner;

class Difference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int smaller = (a < b) ? a : b;
        int larger = (a > b) ? a : b;
        
        int difference = 0;

        while (smaller < larger) {
            smaller++;
            difference++;
        }

        System.out.println("The difference is: " + difference);
    }
}