package net.pine.game.move.constraint;

import net.pine.game.board.Board;
import net.pine.game.move.constraint.constraints.CaptureMoveConstraint;
import net.pine.game.move.constraint.constraints.CastleMoveConstraint;
import net.pine.game.move.constraint.constraints.CheckMoveConstraint;

public abstract class MoveConstraint {
	
	public static final MoveConstraint CASTLE = new CastleMoveConstraint();
	public static final MoveConstraint CHECK = new CheckMoveConstraint();
	public static final MoveConstraint CAPTURE = new CaptureMoveConstraint();
	
	private static final MoveConstraint[] CONSTRAINTS = new MoveConstraint[] {
			CAPTURE, CHECK, CASTLE
	};
	
	public abstract boolean isIllegalMove(int move, Board board);
	
	public static boolean isIllegalMove(int move, Board board) {
		for(MoveConstraint constraint : CONSTRAINTS) {
			
			if(constraint.isIllegalMove(move, board)) return true;
		}
		
		return false;
	}
	
}
