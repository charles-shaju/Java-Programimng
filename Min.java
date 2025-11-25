import java.util.*;
class Min{
    public static void main(String args[]){
        Scanner s;
        s=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int min=((a<b)?((a<c)?a:c):(b<c)?b:c);
        System.out.println("The Min value is "+min);
    }
}