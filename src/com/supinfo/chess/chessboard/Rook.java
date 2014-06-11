package com.supinfo.chess.chessboard;

public class Rook extends Case{
	
						//CONSTRUCTOR :
	
	public Rook(int arrival_x, int arrival_y, String colorCase){
		
		super(arrival_x, arrival_y, colorCase);
		
	}
	
						//METHOD :
	
	
	private boolean isMoveValid( int arrival_x , int arrival_y){
		
		if( this.isWithinBound(arrival_x, arrival_y)== false){
			return false;
		}
		
		if(arrival_x == x){
			return true;
		}
		
		if(arrival_y == y){
			return true;
		}
		
		else
			return false;
	}
	
	
	public void movePice(int arrival_x, int arrival_y){
		
		if(isMoveValid(arrival_x, arrival_y) == true){
			
			x = arrival_x;
			y = arrival_y;
		}
		
		else 
			System.out.println("Invalid move");
	}

}
