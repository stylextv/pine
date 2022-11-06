package net.pine.game.move.constraint.constraints;

import net.pine.game.board.Board;
import net.pine.game.move.constraint.MoveConstraint;

public class CheckMoveConstraint extends MoveConstraint {
	
	@Override
	public boolean isIllegalMove(int move, Board board) {
		// don't leave king in check
		return false;
	}
	
}
