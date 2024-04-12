package Porject2;

public class Grid {

	private boolean[][] bombGrid;
	private int[][] countGrid;
	private int numRows;
	private int numColumns;
	private int numBombs;

	public Grid() {

		countGrid = new int[10][10];

		numBombs = 25;

	}

	public Grid(int rows, int columns) {

		countGrid = new int[columns][rows];

		numBombs = 25;

	}

	public Grid(int rows, int columns, int numBombs) {

		countGrid = new int[columns][rows];

		numBombs = 25;

	}
	
	
	
	
	

}// end class
