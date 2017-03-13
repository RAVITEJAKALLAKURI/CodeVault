package com.ds;

public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int [][] ar = new int[][]{{1, 2, 3,4}, {5, 6,7,8}};
		
rotate(ar, 2);
	}

	public static void rotate(int[][] matrix, int n) {
		 for (int layer = 0; layer < n / 2; ++layer) {
		 int first = layer;
	 int last = n - 1 - layer;
		 for(int i = first; i < last; ++i) {
		 int offset = i - first;
	 int top = matrix[first][i]; // save top
	 // left -> top
		 matrix[first][i] = matrix[last-offset][first];
		
		 // bottom -> left
		 matrix[last-offset][first] = matrix[last][last - offset];
		
		 // right -> bottom
		 matrix[last][last - offset] = matrix[i][last];
		
		 // top -> right
		 matrix[i][last] = top; // right <- saved top
		 }
		 }
		 System.out.println(matrix);
		}
}
