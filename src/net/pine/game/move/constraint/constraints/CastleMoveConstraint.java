package net.pine.game.move.constraint.constraints;

import net.pine.game.board.Board;
import net.pine.game.move.constraint.MoveConstraint;

public class CastleMoveConstraint extends MoveConstraint {
	
	@Override
	public boolean isIllegalMove(int move, Board board) {
		// don't castle in or through check
		return false;
	}
	
}
