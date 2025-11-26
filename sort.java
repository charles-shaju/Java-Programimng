import java.util.*;
class sort{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number in array");
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value for a["+i+"]: ");
            a[i]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[j]<a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
                
            }
        }
        System.out.println("Sorted Array :");
        for(int i=0;i<n;i++){
            System.out.println("\t"+a[i]);
        }
    }
}