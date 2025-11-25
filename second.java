import java.util.*;
class second{
    public static void main(String args[]){
        System.out.println("Enter the number of array");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=0;
        int a[]= new int[n]; 
        for(int i=0;i<n;i++){
            System.out.println("Enter the vales for a["+i+"]: ");
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
        }

        }System.out.println("The second Largest"+a[1]);
    }

}