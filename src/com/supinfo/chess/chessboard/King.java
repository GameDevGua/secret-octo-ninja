package com.supinfo.chess.chessboard;

public class King extends Case{
	
	private int x;
	private int y;
	private String color;
	
	
	//CONSTRUCTOR
	public King(String colorPlayer){
		
		if(colorPlayer == "white"){
			
			x = 4;
			y = 0;
			color ="white";
		}
		
		else if (colorPlayer == "black"){
			x = 4;
			y = 7;
			color = "black";
		}
	}
	
	
	//METHOD :
	
	
	private boolean isMoveValid(int arrival_x, int arrival_y){
		
		//If the square we want to go to is on the same row and is within bound :
		
		if(arrival_y == y){
			
			if(arrival_x == x+1 && arrival_x <=7){
				return true;
			}
			
			if(arrival_x == x-1 && arrival_x >=0){
				return true;
			}
		}
			
			//If the square we want to go to is one row below the king and is within bound:
			
			else if((arrival_y == y+1 && arrival_y <=7)){
				
				if(arrival_x == x+1 && arrival_x <=7){
					return true;
				}
				
				if(arrival_x == x-1 && arrival_x >=0){
					return true;
				}
				
				if(arrival_x == x){
					return true;
				}
				
			}
			
			//If the square we want to go to is one row above the king and is within bound :
			
			else if(arrival_y == y -1 && arrival_y >= 0){
				
				if(arrival_x == x+1 && arrival_x <=7){
					return true;
				}
				
				if(arrival_x == x-1 && arrival_x >=0){
					return true;
				}
				
				if(arrival_x == x){
					return true;
			}
		}
			
		return false;
	}
	
	public void movePiece(int arrival_x, int arrival_y){
		
		if( isMoveValid(arrival_x , arrival_y) == true){
			x = arrival_x;
			y = arrival_y;
		}
		
		else{
			System.out.println("Invalid move");
		}
		
	}

}
