package com.supinfo.chess.chessboard;

public class Case implements Piece {

	protected int x;
	protected int y;
	protected String colorCase;
	
	
	public Case( int start_x, int start_y, String colorOfCase) {
		// TODO Auto-generated constructor stub
		x = start_x;
		y = start_y;
		colorCase = colorOfCase;
		
	}

	@Override
	public void movePiece(int x, int y) {
		// TODO Auto-generated method stub

	}

}
