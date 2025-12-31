package h2;

public class Spielstein {
	private int currentRow;
	private int currentCol;
	private Spielbrett brett;
	public int getCurrentRow() {
		return currentRow;
	}
	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}
	public int getCurrentCol() {
		return currentCol;
	}
	public void setCurrentCol(int currentCol) {
		this.currentCol = currentCol;
	}
	public Spielbrett getBrett() {
		return brett;
	}
	public void setBrett(Spielbrett brett) {
		this.brett = brett;
	}
	public Spielstein(Spielbrett brett, int indexRow, int indexCol) {
		currentRow = indexRow;
		currentCol = indexCol;
		this.brett=brett;
	}
	private boolean movesOut() {
		if(brett.getBrett()[currentRow][currentCol].getDirection()=='U'&&currentRow==0) {
			return true;
		}
		if(brett.getBrett()[currentRow][currentCol].getDirection()=='D'&&currentRow==brett.getDim()-1) {
			return true;
		}
		if(brett.getBrett()[currentRow][currentCol].getDirection()=='R'&&currentCol==brett.getDim()-1) {
			return true;
		}
		if(brett.getBrett()[currentRow][currentCol].getDirection()=='L'&&currentCol==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public void go(int n) {
		for(int i=0;i<n;i++) {
			if(this.movesOut()) {
				break;
			}
			else {
				if(brett.getBrett()[currentRow][currentCol].getDirection()=='U') {
					this.currentRow++;
				}
				if(brett.getBrett()[currentRow][currentCol].getDirection()=='D') {
					this.currentRow--;
				}
				if(brett.getBrett()[currentRow][currentCol].getDirection()=='R') {
					this.currentCol++;
				}
				if(brett.getBrett()[currentRow][currentCol].getDirection()=='L') {
					this.currentCol--;
				}
			}
		}
	}

}
