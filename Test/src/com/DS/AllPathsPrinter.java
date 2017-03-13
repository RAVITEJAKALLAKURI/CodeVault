package com.DS;



	public class AllPathsPrinter {
		 
	    int [][] array;
	    int rowCount;
	    int colCount;
	 
	 
	    public AllPathsPrinter(int [][]array){
	 
	        this.array = array;
	        rowCount = array.length;
	        colCount = array[0].length;
	 
	    }
	 
	 
	    public void printAllPaths(int currX, int currY, String path){
	 
	        if(currX == rowCount-1){
	            for(int j=currY;j<=colCount-1;j++){
	                path = path + array[currX][j];
	            }
	            System.out.println("Path : " + path);
	            return;
	        }
	 
	        if(currY == colCount-1){
	            for(int i=currX;i<=rowCount-1;i++){
	                path = path + array[i][currY];
	            }
	            System.out.println("Path : " + path);
	            return;
	        }
	        path = path + array[currX][currY];
	        printAllPaths(currX+1, currY, path);
	        printAllPaths(currX, currY+1, path);
	 
	    }
	 
	    public static void main(String args[]){
	 
	        int [][] ar = new int[][]{{1, 2, 3,4}, {5, 6,7,8}};
	        AllPathsPrinter allPathsPrinter = new AllPathsPrinter(ar);
	        allPathsPrinter.printAllPaths(0,0,"");
	 
	    }
	 
	 
	}
	
