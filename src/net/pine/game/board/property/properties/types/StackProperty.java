package net.pine.game.board.property.properties.types;

import net.pine.game.board.property.BoardProperty;

public abstract class StackProperty extends BoardProperty {
	
	private int[] values = new int[];
	
	public abstract void onMove(int move);
	
	@Override
	public void onMoveMake(int move) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onMoveUnmake(int move) {
		// TODO Auto-generated method stub
		
	}
	
}
