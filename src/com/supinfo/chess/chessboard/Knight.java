package com.supinfo.chess.chessboard;

public class Knight extends Case{
	
	
									//CONSTRUCTOR :
	
	
	public  Knight(int start_x, int start_y, String colorOfCase){
		
		super(start_x, start_y,colorOfCase);
		
	}
	
	
	
	
											//METHODS :
	
	
	
	
	private boolean isMoveValid(int arrival_x, int arrival_y){			//This method checks if a move is correct 
		
		
		//If the square we want to go is not within bound :
		
		if(this.isWithinBound(arrival_x, arrival_y) == false){
			return false;
		}
		
		//If the square we want to go to is two square on right or on the left :
		
		if( (arrival_x == x + 2 ) || (arrival_x == x-2 ) ){
			
			//....And one row above or below:
			
			if((arrival_y == y +1 ) || (arrival_y == y-1 )){
				return true;
			}
			else{
				return false;
			}
				
		}
		
		
		//If the square we want to go to is two squares above  or two squares below :
		
		if( (arrival_y == y+2 ) || (arrival_y == y-2 )){
			
			//....And one square on the right or left :
			
			if( (arrival_x == x-1 )  || ( arrival_x == x+1 )){
				
				return true;
			}
			
			else{
				return false;
			}
		}
		
		else 
		return false;
	}
	
	
	
	
	public void movePiece(int arrival_x, int arrival_y){		// This method moves the piece if the move is a valid one
		
		if (isMoveValid(arrival_x, arrival_y) == true){
		 	
		 	x = arrival_x;
		 	y = arrival_y;
		}
		
		else
			System.out.println("Invalid move");
		
	}

}
