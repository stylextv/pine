package net.pine.game.move.constraint.constraints;

import net.pine.game.board.Board;
import net.pine.game.move.MoveTarget;
import net.pine.game.move.constraint.MoveConstraint;
import net.pine.game.piece.Piece;
import net.pine.game.piece.PieceColor;

public class CaptureMoveConstraint extends MoveConstraint {
	
	@Override
	public boolean isIllegalMove(int move, Board board) {
		int square = MoveTarget.ofMove(move);
		
		int piece = board.getPiece(square);
		
		if(piece == Piece.NONE) return false;
		
		int pieceColor = PieceColor.ofPiece(piece);
		
		return pieceColor == board.getTurn();
	}
	
}
