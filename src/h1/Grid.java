package h1;

import java.util.ArrayList;

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
	public int checkNeighbors(int row,int col) {
		int k=0;
		for(int i=0;i<gridArray.length;i++) {
			for(int j=0;j<gridArray[i].length;j++) {
				if(Math.abs(i-row)+Math.abs(j-col)==1||(Math.abs(i-row)+Math.abs(j-col)==2&&j!=col&&i!=row)) {
					if(gridArray[i][j].alive=true) {
						k++;
					}
				}
			}
		}
		return k;
	
	}
	public void computeNextGen() {
		ArrayList<Cell>choppingblock=new ArrayList<>();
		ArrayList<Cell>birthplace=new ArrayList<>();
		for(int i=0;i<gridArray.length;i++) {
			for(int j=0;j<gridArray[i].length;j++) {
				if(gridArray[i][j].alive=true) {
					if(checkNeighbors(i,j)==2||checkNeighbors(i,j)==3) {
						
					}
					else {
						choppingblock.add(gridArray[i][j]);
					}
				}
				else {
					if(checkNeighbors(i,j)==3) {
						birthplace.add(gridArray[i][j]);
					}
					
				}
			}
		}
		for(int i=0;i<choppingblock.size();i++) {
			gridArray[choppingblock.get(i).indexRow][choppingblock.get(i).indexCol].alive=false;
		}
		for(int i=0;i<birthplace.size();i++) {
			gridArray[birthplace.get(i).indexRow][birthplace.get(i).indexCol].alive=true;
		}
	}
	public void computeGeneration(int n) {
		for(int i=0;i<n;i++) {
			computeNextGen();
		}
	}
	

}
