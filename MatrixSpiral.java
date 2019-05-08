public class MatrixSpiral {
    public static void main(String[] args){
        int[][] matrix = {
            {9, 3, 4, 1, 7, 2, 6, 8, 5},
            {7, 6, 5, 8, 9, 3, 2, 4, 1},
            {8, 1, 2, 6, 4, 5, 3, 9, 7},
            {4, 2, 9, 5, 8, 1, 7, 6, 3},
            {6, 5, 8, 7, 3, 9, 1, 2, 4},
            {1, 7, 3, 4, 2, 6, 8, 5, 9},
            {2, 9, 7, 3, 5, 8, 4, 1, 6},
            {5, 4, 6, 2, 1, 7, 9, 3, 8},
            {3, 8, 1, 9, 6, 4, 5, 7, 2}};
    
        printSpiral(matrix);

    }

    static void printSpiral(int[][] mat){
    	if(mat!=null &&mat.length>0&&mat[0].length>0){
    		printMatrix(mat, 0, 0, mat.length-1);
    	}
    }
    
    private static void printMatrix(int[][] mat , int gridLevel , int start , int end ){
    	if(start==end){ // Exit case
    		System.out.println(mat[start][end]);
    		return;
    	}
    	printGrid(mat, gridLevel, start, end); // print outerShell and then recurse for inner-shell
    	printMatrix(mat,++gridLevel,++start,--end);
    }
    
    // print matrix grid shell one layer based on level provided
    private static void printGrid(int[][] mat,int level ,int start,int end){
    	int i=0;
    	int j=0;
    	
    	// print topGrid
    	for(i=start;i<end;i++){
    		System.out.print(mat[level][i]);
    	}
    	
    	// print rightGrid
    	for(j=start;j<end;j++){
    		System.out.print(mat[j][mat.length-level-1]);
    	}
    	
    	// print lowerGrid
    	for(i=end;i>start;i--){
    		System.out.print(mat[mat.length-level-1][i]);
    	}
    	
    	// print leftGrid
    	for(j=end;j>start;j--){
    		System.out.print(mat[j][level]);
    	}
    	System.out.println();
    }
}