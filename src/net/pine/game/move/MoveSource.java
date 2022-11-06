package net.pine.game.move;

import net.pine.game.serialize.Serializer;

public class MoveSource {
	
	public static int ofMove(int move) {
		return Serializer.MOVE.getComponent(move, Serializer.MOVE_SOURCE);
	}
	
}
