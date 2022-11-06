package net.pine.game.board.view.views;

import net.pine.game.board.bitboard.Bitboard;
import net.pine.game.board.bitboard.bitboards.PositionBitboard;
import net.pine.game.board.view.BoardView;

public class BitboardView extends BoardView {
	
	private long[] bitboards = new long[];
	
	@Override
	public void removePiece(int square, int piece) {
		long bb = PositionBitboard.ofSquare(piece);
		
		bitboards[piece];
	}
	
	@Override
	public void setPiece(int square, int piece) {
		
	}
	
	public long getPieceBitboard(int color, int type) {
		long bb1 = getColorBitboard(color);
		long bb2 = getTypeBitboard(type);
		
		return Bitboard.intersection(bb1, bb2);
	}
	
	public long getTypeBitboard(int type) {
		return ;
	}
	
	public long getColorBitboard(int color) {
		return ;
	}
	
}
