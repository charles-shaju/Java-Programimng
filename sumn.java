import java.util.*;

class sumn{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0,isum=0,sum=0;
        while(i<=n){
            isum+=i;
            sum+=isum;
            i++;
        }
        System.out.println(sum);
    }
}
