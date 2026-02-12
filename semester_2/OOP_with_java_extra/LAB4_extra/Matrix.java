import java.util.Scanner;
class Matrix{
    Scanner scan = new Scanner(System.in);
    private int[][] matrix= new int[2][2];
    Matrix(int[][] matrix){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }
    int[][] addMatrices(int[][] m1, int[][] m2){
        int[][] matrix = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrix[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return matrix;
    }
    int[][] multiplyByScalar(int[][] m, int scalar){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                m[i][j] = m[i][j] * scalar;
            }
        }
        return m;
    }
    int findMaximum(int[][] matrix){
        int max = matrix[0][0];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    int[][] createTriangularMatrix(int size){
        int[][] triMatrix = new int[size][];
        int ind = size-1;
        for(int i=0;i<size;i++){
        triMatrix[(size - ind)-1] = new int[size - ind];
        ind--;
        }
        for(int i=0;i<size;i++){
            System.out.println("Enter element ("+(i+1)+" element) of row " + (i+1));
            for(int j=0;j<triMatrix[i].length;j++){
            triMatrix[i][j] = scan.nextInt();
        }
        }
        return triMatrix;
    }
    void displayMatrix(int[][] m){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    int getRowSum(int[][] m,int row){
        int sum = 0;
        for(int j=0;j<2;j++){
                sum += m[row][j];
            }
        return sum;
    }
    int getColumnSum(int[][] m,int col){
        int sum = 0;
        for(int j=0;j<2;j++){
                sum += m[j][col];
            }
        return sum;
    }
}
class Main {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2},{3,4}
        };
        Matrix matrix = new Matrix(mat);
        
        int[][] mat1 = {
            {6,2},{7,5}
        };
        int[][] mat2 = {
            {9,4},{2,3}
        };
        
        System.out.println("===== Matrix Addition =====");
        int[][] result = matrix.addMatrices(mat1,mat2);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n===== Matrix Multiplication by Scalar =====");
        result = matrix.multiplyByScalar(mat1,3);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\n===== Maximum Value =====");
        int max = matrix.findMaximum(mat2);
        System.out.println("The maximum value of matrix is: " + max);
        
        System.out.println("\n===== Entering and printing triangular Matrix =====");
        int[][] triMatrix = matrix.createTriangularMatrix(5);
        System.out.println("\n===== Here is your triangular Matrix =====");
        for(int i=0;i<5;i++){
            for(int j=0;j<triMatrix[i].length;j++){
                System.out.print(triMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\n===== Matrix Display =====");
        matrix.displayMatrix(mat1);
        
        System.out.println("\n===== Sum of Specific row =====");
        int rowSum = matrix.getRowSum(mat1,1);
        System.out.println("Sum of row: " + rowSum);
        
        System.out.println("\n===== Sum of Specific column =====");
        int colSum = matrix.getColumnSum(mat1,0);
        System.out.println("Sum of column: " + colSum);
    }
}
