package com.supinfo.chess.chessboard;

public class Queen extends Case{
	
	
	
									//CONSTRUCTOR :
	
	
	
	public Queen(int start_x, int start_y , String colorOfCase){
		
		super(start_x, start_y, colorOfCase);
	}
	
	
										//METHODS :
	
	
	
private boolean isMoveValid(int arrival_x, int arrival_y){
	
	//If the square we want to go is on the same row and is within bound :
	if( (arrival_y == y) && (arrival_x <= 7 )&& (arrival_x >= 0)){
		
		return true;
	}
	
	//If the square we want to go is on the same column and is within bound : 
	
	if( (arrival_x == x) && (arrival_y >= 0 ) && (arrival_y <=7)){
		return true;
	}
	
	//If the square we want to go to is on the same diagonal an is within bound :
	
	if( (arrival_x >=0 && arrival_x <=7 )&& (arrival_y >=0 && arrival_y <=7) && (arrival_x - x ) == (arrival_y - y)){
		
		return true;
	}
	else
		return false;
}
	
public void movePiece(int arrival_x, int arrival_y){
		
		if( isMoveValid(arrival_x, arrival_y) ){
			x = arrival_x;
			y = arrival_y;
		}
		
		else
		System.out.println("Invalid move");
	}

}
