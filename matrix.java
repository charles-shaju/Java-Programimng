import java.util.*;
class matrix{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int r1=s.nextInt();
        int c1=s.nextInt();
        int[][] m1=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.println("Enter the values for m["+i+"]["+j+"]");
                m1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns for second matrix: ");
        int r2=s.nextInt();
        int c2=s.nextInt();
        int[][] m2=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.println("Enter the values for m["+i+"]["+j+"]");
                m2[i][j]=s.nextInt();
            }
        }
        if(c1!=r2){
            System.out.println("Error: Wrong Dimensions");
            return;
        }
        int[][] r=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                r[i][j]=0;
                for(int k=0;k<c1;k++){
                    r[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(r[i][j]+"\t");
            }
            System.out.println();
        }



    }

}