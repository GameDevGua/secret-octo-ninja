package com.supinfo.chess.chessboard;

public class Pawn extends Case{
	
	boolean  firstMove;
	boolean  capturePiece;
	
						//CONSTRUCTOR :
	
	public Pawn(int start_x, int start_y, String colorCase){
		
		super(start_x , start_y, colorCase);
		firstMove = true;
		capturePiece = false;
	}
	
	
						//METHODS :
	


private boolean isCaptureModeOn(){		//this methods checks if we are eating an other piece
		
		if(capturePiece == true){
			return true;
		}
		
		else{
			return false;
		}
		
	}
	


public void activateOrDeactivateCatureMode(boolean activation){		//this method activate or deactivate the capture mode
	
	if(activation == true){
		capturePiece = true;
	}
	else{
		capturePiece = false;
	}
}

	private boolean isMoveValid(int arrival_x , int arrival_y ){
		
		if(this.isWithinBound(arrival_x, arrival_y) == false){
			return false;
		}
		
		
		switch(colorCase){
		
			case "white" :
				//If the square we want to go to is one square above :
				
				if(arrival_x== x  && arrival_y == y -1){
					return true;
				}
				
				
				//If the square we want to go to is two square above :
				if(arrival_x== x  && arrival_y == y -2){
					
					if(firstMove == true){	//....And it is the first time the pawn moves
						return true;
					}
					else{
						return false;
					}
				}
				
				//If the square we want to go to is one square on the right or the left
				//and one row above :
				if( (arrival_x == x+1) || (arrival_x == x-1) 
						&& (arrival_y == y -1) ){
					
					if(isCaptureModeOn() == true){		//....And we are capturing an other piece
						return true;
					}
					else{
						return false;
					}
						
				}
				break;
				
			case "black" :
				//If the square we want to go to is one square below :
				
				if(arrival_x== x  && arrival_y == y +1){
					return true;
				}
				
				
				//If the square we want to go to is one square on the right or the left
				//and one row below :
				
				if( (arrival_x == x+1) || (arrival_x == x-1) 
						&& (arrival_y == y +1) ){
					
					if(isCaptureModeOn() == true){		//....And we are capturing an other piece 
						return true;
					}
					else{
						return false;
					}
						
				}
				
				//If the square we want to go to is two squares below :
				if(arrival_x== x  && arrival_y == y +2){
					
					if(firstMove == true){	//.....And it is the first time the pawn moves
						return true;
					}
					else{
						return false;
					}
				}
				break;
			
			default :
				break;
		}
		
		return false;
	}
	
	

}
