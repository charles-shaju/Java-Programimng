

class SwapLogics {
    public static void main(String args[]) {
        int a = 10, b = 20;

        System.out.println("Logic 1 (Temp Variable)");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Logic 1: a=" + a + " b=" + b);

        a = 10; b = 20; 

        System.out.println("\nLogic 2 (+ and -)");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Logic 2: a=" + a + " b=" + b);

        a = 10; b = 20;

        System.out.println("\n Logic 3 (XOR ^) ");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Logic 3: a=" + a + " b=" + b);
    }
}