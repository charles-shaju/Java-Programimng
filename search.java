import java.util.*;

class search{
    public static void main(String args[]){
        System.out.println("Enter the number of array");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean flag=true;
        int a[]= new int[n]; 
        for(int i=0;i<n;i++){
            System.out.println("Enter the vales for a["+i+"]: ");
            a[i]=s.nextInt();
        }
        
        System.out.println("Enter the element to search");
        int sr=s.nextInt();
        for(int i=0;i<n;i++){
            if(sr==a[i]){
                flag=true;
                System.out.println("The element fount at postion"+(i+1));
                break;
            }
        }
        if(!flag){
                System.out.println("The elemnet not found");
        }

    }
}