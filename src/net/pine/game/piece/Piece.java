package net.pine.game.piece;

import net.pine.game.serialize.SerializeObject;

public class Piece {
	
	public static final int WHITE_PAWN   = from(PieceColor.WHITE, PieceType.PAWN);
	public static final int WHITE_KNIGHT = from(PieceColor.WHITE, PieceType.KNIGHT);
	public static final int WHITE_BISHOP = from(PieceColor.WHITE, PieceType.BISHOP);
	public static final int WHITE_ROOK   = from(PieceColor.WHITE, PieceType.ROOK);
	public static final int WHITE_QUEEN  = from(PieceColor.WHITE, PieceType.QUEEN);
	public static final int WHITE_KING   = from(PieceColor.WHITE, PieceType.KING);
	
	public static final int BLACK_PAWN   = from(PieceColor.BLACK, PieceType.PAWN);
	public static final int BLACK_KNIGHT = from(PieceColor.BLACK, PieceType.KNIGHT);
	public static final int BLACK_BISHOP = from(PieceColor.BLACK, PieceType.BISHOP);
	public static final int BLACK_ROOK   = from(PieceColor.BLACK, PieceType.ROOK);
	public static final int BLACK_QUEEN  = from(PieceColor.BLACK, PieceType.QUEEN);
	public static final int BLACK_KING   = from(PieceColor.BLACK, PieceType.KING);
	
	public static final int NONE = SerializeObject.EMPTY;
	
	// TODO rename
	public static int from(int color, int type) {
		
	}
	
}
