package h1;

public class Grid {
	private Cell[][]gridArray;
	public void setGridArray(Cell[][]cells) {
		gridArray=cells;
	}
	public Cell[][]getGridArray(){
		return gridArray;
	}
	public Grid(Cell[] cells,int gridRows,int gridCols) {
		gridArray=new Cell[gridRows][gridCols];
		for(int i=0;i<cells.length;i++) {
			gridArray[cells[i].indexRow][cells[i].indexCol].alive=true;
		}
	}
	public void computeNextGen() {
		for(int i=0;)
	}

}
