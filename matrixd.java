import java.util.*;
class matrixd{
    public static void main(String args[]){
        int r=2,c=2;
        Scanner s=new Scanner(System.in);
        int[][] a=new int[r][c];
        int[] colsum=new int[c];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter the value for a["+i+"]");
                a[i][j]=s.nextInt();
                colsum[j]+=a[i][j];

             }
        }
        System.out.println("Result: ");
        for(int i=0;i<r;i++){
            int rowsum=0;
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+"\t");
                rowsum+=a[i][j];
            }
            System.out.println("| "+rowsum);
        }
        System.out.println("---------");
        for(int i=0;i<c;i++){
            System.out.print(colsum[i]+"\t");
        }

    }
}