package animate.model;

import java.util.Arrays;

public class MoveObject {
private int cols;
private int rows;

private String currentPosition;
private String direction;
  public MoveObject() {
	  
  }

	public MoveObject(int rows, int cols, String currentPosition, String direction) {
	
	this.rows = rows;
	this.cols = cols;
	this.currentPosition = currentPosition;
	this.direction = direction;
}

	public int getRows() {

	return rows;
}

public void setRows(int rows) {
	
	this.rows = rows;
}

public int getCols() {
	
	return cols;
}

public void setCols(int cols) {
	this.cols = cols;
}

public String getCurrentPosition() {
	return currentPosition;
}

public void setCurrentPosition(String currentPosition) {
	this.currentPosition = currentPosition;
}

public String getDirection() {
	return direction;
}

public void setDirection(String direction) {
	this.direction = direction;
}

	
	
	}