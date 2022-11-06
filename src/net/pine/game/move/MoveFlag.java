package net.pine.game.move;

import net.pine.game.serialize.SerializeObject;
import net.pine.game.serialize.Serializer;

public class MoveFlag {
	
	public static final int PAWN_PUSH = 1;
	public static final int EN_PASSANT = 2;
	public static final int CASTLE = 3;
	
	public static final int NONE = SerializeObject.EMPTY;
	
	public static int ofMove(int move) {
		return Serializer.MOVE.getComponent(move, Serializer.MOVE_FLAG);
	}
	
}
