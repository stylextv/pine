package net.pine.game.board.position;

import net.pine.game.serialize.Serializer;

public class BoardFile {
	
	public static final int A_FILE = 0;
	public static final int B_FILE = 1;
	public static final int C_FILE = 2;
	public static final int D_FILE = 3;
	public static final int E_FILE = 4;
	public static final int F_FILE = 5;
	public static final int G_FILE = 6;
	public static final int H_FILE = 7;
	
	public static int fromSquare(int square) {
		return Serializer.SQUARE.getComponent(square, Serializer.FILE);
	}
	
}
