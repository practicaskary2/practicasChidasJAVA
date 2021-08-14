
public class EjemploArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [][] matrix = new int [4][5];
		
		matrix[0][0] = 5 ;
	    matrix[0][1] = 8;
	    matrix[0][2] = 45;
	    matrix[0][3] = 3;
	    matrix[0][4] = 7;
	    
	    matrix[1][0] = 7;
	    matrix[1][1] = 4;
	    matrix[1][2] = 67;
	    matrix[1][3] = 42;
	    matrix[1][4] = 78;
	    
	    matrix[2][0] = 67;
	    matrix[2][1] = 89;
	    matrix[2][2] = 2;
	    matrix[2][3] = 90;
	    matrix[2][4] = 43;
	    
	    matrix[3][0] = 23;
	    matrix[3][1] = 11;
	    matrix[3][2] = 34;
	    matrix[3][3] = 70;
	    matrix[3][4] = 84;
	    
	    for(int i=0;i<4;i++) {
	    	System.out.println();
	    	for(int j=0;j<5;j++) {
	    		System.out.print(matrix[i][j] + " ");
	    	}
	    }
		
	
	}

}
