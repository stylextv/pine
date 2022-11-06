package net.pine.game.board.property;

public abstract class BoardProperty {
	
	private int value;
	
	public abstract void onMoveMake(int move);
	public abstract void onMoveUnmake(int move);
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
