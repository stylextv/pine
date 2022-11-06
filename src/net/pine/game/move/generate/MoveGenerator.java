package net.pine.game.move.generate;

import net.node.game.board.Board;
import net.node.game.move.list.MoveList;

public abstract class MoveGenerator {
	
	public static final MoveGenerator PAWN = ;
	
	public static final MoveGenerator KNIGHT = ;
	
	public static final MoveGenerator BISHOP = ;
	
	public static final MoveGenerator ROOK = ;
	
	public static final MoveGenerator QUEEN = ;
	
	public static final MoveGenerator KING = ;
	
	private static final MoveGenerator[] GENERATORS = new MoveGenerator[] {
			PAWN, KNIGHT, BISHOP, ROOK, QUEEN, KING
	};
	
	public abstract void generateMoves(Board board, MoveList list);
	
	public static MoveList generateMoves(Board board) {
		MoveList list = ;
		
		for(MoveGenerator g : GENERATORS) {
			
			g.generateMoves(board, list);
		}
		
		return list;
	}
	
	public static MoveGenerator[] getGenerators() {
		return GENERATORS;
	}
	
}
