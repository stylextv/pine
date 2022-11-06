package net.pine.game.move.generate.generators.types;

import net.pine.game.board.Board;
import net.pine.game.move.generate.MoveGenerator;
import net.pine.game.move.list.MoveList;

public abstract class SetMoveGenerator extends MoveGenerator {
	
	public SetMoveGenerator(int pieceType) {
		super(pieceType);
	}
	
	public abstract void generateMoves(Board board, long bb, MoveList list);
	
	@Override
	public void generateMoves(Board board, int pieceColor, MoveList list) {
		int pieceType = getPieceType();
		
		long bb = board.getPieceBitboard(pieceColor, pieceType);
		
		generateMoves(board, bb, list);
	}
	
}
