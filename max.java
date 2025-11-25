class MaxOfThree{
    public static void main(String args[]) {
        int a= 10;
        int b= 20;
        int c= 30;
        int max1;
        if (a >= b && a >= c) {
            max1 = a;
        } else if (b >= a && b >= c) {
            max1 = b;
        } else {
            max1 = c;
        }
        System.out.println("\nLogic 1 (If-Else): Maximum is " + max1);

        int max2 = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Logic 2 (Ternary): Maximum is " + max2);

        int max3 = Math.max(a, Math.max(b, c));
        System.out.println("Logic 3 (Math.max): Maximum is " + max3);
    }
}