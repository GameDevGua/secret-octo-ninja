package com.supinfo.chess.chessboard;

public class Bishop extends Case{

	
						//CONSTRUCTOR :
	
	
	public Bishop(int start_x, int start_y, String colorCase){
		
		super(start_x, start_y,colorCase);
	}
	
	
						//METHODS :
	
	private boolean isMoveValid(int arrival_x, int arrival_y){	//This method checks if the move is valid for this piece
		
		//If the square we want to go to is not within bound : 
		
		if(this.isWithinBound(arrival_x, arrival_y) == false){
			return false;
			
		}
		
		//If the square we want to go to is on the same diagonal :
		
		if((arrival_x -x) == (arrival_y - y)){
			return true;
		}
		
		//Otherwise :
		else{
			return false;
		}
	}
	
	public void movePieve(int arrival_x , int arrival_y){	//This method move the piece on the board if it is possible
		
		if(isMoveValid(arrival_x, arrival_y) == true){
			x = arrival_x;
			y = arrival_y;
		}
		else
			System.out.println("Invalid move");
	}
}
