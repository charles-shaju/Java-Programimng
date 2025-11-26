import java.util.Scanner;

class QuadraticRoots {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 1. Input the coefficients a, b, and c
        System.out.println("Enter coefficient a:");
        double a = sc.nextDouble();
        
        System.out.println("Enter coefficient b:");
        double b = sc.nextDouble();
        
        System.out.println("Enter coefficient c:");
        double c = sc.nextDouble();

        // 2. Calculate the Discriminant (D = b^2 - 4ac)
        double d = (b * b) - (4 * a * c);
        
        System.out.println("\nDiscriminant (D) = " + d);

        // 3. Check the nature of the roots
        if (d > 0) {
            // Case 1: Two Real and Distinct Roots
            System.out.println("Roots are Real and Distinct.");
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
            
        } else if (d == 0) {
            // Case 2: Two Real and Equal Roots
            System.out.println("Roots are Real and Equal.");
            double root1 = -b / (2 * a);
            
            System.out.println("Root 1 = Root 2 = " + root1);
            
        } else {
            // Case 3: Roots are Complex (Imaginary)
            System.out.println("Roots are Complex (Imaginary).");
            
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a); // Use positive D for sqrt
            
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}