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
		
		else{
			x = 4;
			y = 7;
			color = "black";
		}
	}
	
	
	//METHOD :
	
	public void movePiece(int arrival_x, int arrival_y){
		
		//if( isMoveValid() == ok )
		
		x = arrival_x;
		y = arrival_y;
		
		//else
		//system.out.println("Invalid move");
	}

}
