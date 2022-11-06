package net.pine.game.board.view.views;

import net.pine.game.board.view.BoardView;
import net.pine.game.piece.Piece;

public class PieceView extends BoardView {
	
	private int[][] pieceSquares = new int[][];
	
	private int[] pieceIndices = new int[];
	
	private int[] pieceAmounts = new int[];
	
	@Override
	public void removePiece(int square, int piece) {
		int index = pieceIndices[square];
		int amount = pieceAmounts[piece]--;
		
		for(int i = index; i < amount; i++) {
			
			int j = pieceSquares[piece][i + 1];
			
			pieceSquares[piece][i] = j;
			pieceIndices[j]--;
		}
	}
	
	@Override
	public void setPiece(int square, int piece) {
		int amount = pieceAmounts[piece];
		
		pieceSquares[piece][amount] = square;
		
		pieceIndices[square] = amount;
		pieceAmounts[piece] = amount + 1;
	}
	
	public int getPieceSquare(int piece, int index) {
		return pieceSquares[piece][index];
	}
	
	public int getPieceIndex(int square) {
		return pieceIndices[square];
	}
	
	public int getPieceAmount(int piece) {
		return pieceAmounts[piece];
	}
	
}
