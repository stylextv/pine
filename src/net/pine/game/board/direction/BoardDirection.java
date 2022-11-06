package net.pine.game.board.direction;

public class BoardDirection {
	
	public static final int NORTH = 8;
	public static final int NORTH_EAST = 9;
	public static final int NORTH_WEST = 7;
	
	public static final int SOUTH = -8;
	public static final int SOUTH_EAST = -7;
	public static final int SOUTH_WEST = -9;
	
	public static final int EAST = 1;
	public static final int WEST = -1;
	
	private static final int[] DIRECTIONS = new int[] {
			NORTH, NORTH_EAST, NORTH_WEST,
			SOUTH, SOUTH_EAST, SOUTH_WEST,
			EAST, WEST
	};
	
	public static int[] getDirections() {
		return DIRECTIONS;
	}
	
}
