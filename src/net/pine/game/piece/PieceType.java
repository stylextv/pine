package net.pine.game.piece;

import net.pine.game.serialize.SerializeObject;
import net.pine.game.serialize.Serializer;

public class PieceType {
	
	public static final int PAWN = 1;
	public static final int KNIGHT = 2;
	public static final int BISHOP = 3;
	public static final int ROOK = 4;
	public static final int QUEEN = 5;
	public static final int KING = 6;
	
	public static final int NONE = SerializeObject.EMPTY;
	
	public static int ofPiece(int piece) {
		return Serializer.PIECE.getComponent(piece, Serializer.PIECE_TYPE);
	}
	
}
