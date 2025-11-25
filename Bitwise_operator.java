
class BitwiseDemo{
    public static void main(String args[]) {
        int a = 5; 
        int b = 7;
        System.out.println("\nBitwise Logical Operators");
        
        System.out.println("a & b (AND): " + (a & b));
        System.out.println("a | b (OR) : " + (a | b));
        System.out.println("a ^ b (XOR) : " + (a ^ b));
        System.out.println("~a (Complement): " + (~a));

        int x = 10; // Binary: 0000 1010
        System.out.println("x << 2 (Left Shift): " + (x << 2));
        System.out.println("x >> 2 (Right Shift): " + (x >> 2));
  }
}