public class ReverseSpiralMatrix {
    public static void main(String[] args){
        int A= 10;
        int[][] result = generateMatrix(A);
        printMatrix(result);
    }
        public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

     public static int[][] generateMatrix(int A) {
        int[][] matrix = new int[A][A];
        
        int top = 0, bottom = A - 1;
        int left = 0, right = A - 1;
        int num = 1;
        
        while (top <= bottom && left <= right) {
            
            // Left to Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            
            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            
            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            
            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }
        
        return matrix;
    }
    
}
