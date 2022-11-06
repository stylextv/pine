package net.pine.game.board.view.views;

import net.pine.game.board.view.BoardView;
import net.pine.game.piece.Piece;

public class PieceView extends BoardView {
	
	private int[][] pieceSquares = new int[][];
	
	private int[] pieceIndices = new int[];
	
	private int[] pieceCounts = new int[];
	
	@Override
	public void removePiece(int square, int piece) {
		int index = pieceIndices[square];
		int count = pieceCounts[piece]--;
		
		for(int i = index; i < count; i++) {
			
			int j = pieceSquares[piece][i + 1];
			
			pieceSquares[piece][i] = j;
			pieceIndices[j]--;
		}
	}
	
	@Override
	public void setPiece(int square, int piece) {
		int count = pieceCounts[piece];
		
		pieceSquares[piece][count] = square;
		
		pieceIndices[square] = count;
		pieceCounts[piece] = count + 1;
	}
	
	public int getPieceSquare(int piece, int index) {
		return pieceSquares[piece][index];
	}
	
	public int getPieceIndex(int square) {
		return pieceIndices[square];
	}
	
	public int getPieceCount(int piece) {
		return pieceCounts[piece];
	}
	
}
