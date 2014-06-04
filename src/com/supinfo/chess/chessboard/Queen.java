package com.supinfo.chess.chessboard;

public class Queen {
	
	private int x;
	private int y;
	private String color;
	
	
	//CONSTRUCTOR :
	
	
	public Queen(String colorPlayer){
		
		if(colorPlayer == "white"){
			
			x = 5;
			y = 0;
			color = "white";
		}
		
		else{
			
			x = 5;
			y = 7;
			color = "black";
		}
	}
	
	
	//METHOD :
	
private boolean isMoveValid(int arrival_x, int arrival_y){
	
	//If the square we want to go is on the same raw and is within bound :
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
