package net.pine.game.board.property.properties;

import net.pine.game.board.property.properties.types.SymmetricProperty;
import net.pine.game.piece.PieceColor;

public class TurnProperty extends SymmetricProperty {
	
	@Override
	public void onMove(int move) {
		int color = getValue();
		
		color = PieceColor.opposite(color);
		
		setValue(color);
	}
	
}
