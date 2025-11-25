import java.util.*;

class prime{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        boolean flag=true;
        if(a<=1){
            flag=false;
        }else{
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                flag=false;
                break;
            }
        }}
        if(flag){
            System.out.println("The Number is Prime");
        }else{
            System.out.println("The Number is not Prime");
        }

    }
}