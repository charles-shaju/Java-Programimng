import java.util.*;

class secret{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int SecretValue=27;
        int count=0,a;
        do {
            System.out.println("Predict a number between 20 and 30");
            a=s.nextInt();
            if(a!=SecretValue){
                System.out.println("Failure");
                count++;
            }
        }while(a!=SecretValue);
            System.out.println("Success");
            System.out.println("The number of attempts"+count);
    }
}