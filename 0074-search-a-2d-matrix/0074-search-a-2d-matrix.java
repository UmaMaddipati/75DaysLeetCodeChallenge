class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int n = matrix.length;  
        int m = matrix[0].length; 
        
        // Traverse the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    // Return true if target is found
                    return true; 
                }
            }
        }
        // Return false if target is not found
        return false; 
    }
}