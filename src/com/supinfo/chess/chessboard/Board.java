package com.supinfo.chess.chessboard;



public class Board {

	private Case board[][];
	
	public Board() {

		board = new Case[8][8];
		for(int x = 0; x < 8; x++) {
			for(int y =0; y < 8; y++) {
				board[x][y] = new Case();
			}
		}
		
	}

}
