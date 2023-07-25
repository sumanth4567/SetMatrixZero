import java.util.Scanner;
class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
       int rows=matrix.length;
       int cols=matrix[0].length;
       int arr[]=new int[rows];
       int brr[]=new int[cols];
       for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    arr[i]=1;
                    brr[j]=1;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i]==1 || brr[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
  public static void main(String args[]){
        int rows=0,cols=0;
        Scanner sc=new Scanner(System.in);
        SetMatrixZeroes s=new SetMatrixZeroes();
        System.out.println("enter values of rows and cols:");
        rows=sc.nextInt();
        cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        System.out.println("enter the matrix values:");
        for(int i=0;i<rows;i++){
             for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        s.setZeroes(matrix);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
