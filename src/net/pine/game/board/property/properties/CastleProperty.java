package net.pine.game.board.property.properties;

import net.pine.game.board.property.properties.types.StackProperty;

public class CastleProperty extends StackProperty {
	
	@Override
	public void onMove(int move) {
		// on king move -> lose all castle perms
		// on rook move or capture -> lose castle perm for that side
	}
	
	public boolean canCastle(int color, int side) {
		
	}
	
}
