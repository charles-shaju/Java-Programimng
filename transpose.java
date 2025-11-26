import java.util.*;
class transpose{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter the values for m["+i+"]["+j+"]");
                m[i][j]=s.nextInt();
            }
        }
        int[][] t=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[i][j]=0;
                t[i][j]=m[j][i];
                
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(t[i][j]+"\t");
            }
            System.out.println();
        }



    }

}