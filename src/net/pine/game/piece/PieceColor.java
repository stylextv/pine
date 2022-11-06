package net.pine.game.piece;

import net.pine.game.serialize.SerializeObject;
import net.pine.game.serialize.Serializer;

public class PieceColor {
	
	public static final int WHITE = 1;
	public static final int BLACK = 2;
	
	public static final int NONE = SerializeObject.EMPTY;
	
	public static int opposite(int color) {
		if(color == WHITE) return BLACK;
		
		return WHITE;
	}
	
	public static int ofPiece(int piece) {
		return Serializer.PIECE.getComponent(piece, Serializer.PIECE_COLOR);
	}
	
}
