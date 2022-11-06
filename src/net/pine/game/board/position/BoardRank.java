package net.pine.game.board.position;

import net.pine.game.serialize.Serializer;

public class BoardRank {
	
	public static final int RANK_1 = 0;
	public static final int RANK_2 = 1;
	public static final int RANK_3 = 2;
	public static final int RANK_4 = 3;
	public static final int RANK_5 = 4;
	public static final int RANK_6 = 5;
	public static final int RANK_7 = 6;
	public static final int RANK_8 = 7;
	
	public static int fromSquare(int square) {
		return Serializer.SQUARE.getComponent(square, Serializer.SQUARE_RANK);
	}
	
}
