package net.pine.game.move.generate;

import net.pine.game.board.Board;
import net.pine.game.move.generate.generators.BishopMoveGenerator;
import net.pine.game.move.generate.generators.KingMoveGenerator;
import net.pine.game.move.generate.generators.KnightMoveGenerator;
import net.pine.game.move.generate.generators.PawnMoveGenerator;
import net.pine.game.move.generate.generators.QueenMoveGenerator;
import net.pine.game.move.generate.generators.RookMoveGenerator;
import net.pine.game.move.list.MoveList;

public abstract class MoveGenerator {
	
	public static final MoveGenerator PAWN = new PawnMoveGenerator();
	
	public static final MoveGenerator KNIGHT = new KnightMoveGenerator();
	
	public static final MoveGenerator BISHOP = new BishopMoveGenerator();
	
	public static final MoveGenerator ROOK = new RookMoveGenerator();
	
	public static final MoveGenerator QUEEN = new QueenMoveGenerator();
	
	public static final MoveGenerator KING = new KingMoveGenerator();
	
	private static final MoveGenerator[] GENERATORS = new MoveGenerator[] {
			PAWN, KNIGHT, BISHOP, ROOK, QUEEN, KING
	};
	
	private int pieceType;
	
	public MoveGenerator(int pieceType) {
		this.pieceType = pieceType;
	}
	
	public abstract void generateMoves(Board board, int pieceColor, MoveList list);
	
	public void generateMoves(Board board, MoveList list) {
		int pieceColor = board.getTurn();
		
		generateMoves(board, pieceColor, list);
	}
	
	public int getPieceType() {
		return pieceType;
	}
	
	public static MoveList generateMoves(Board board) {
		MoveList list = ; // get move list object based on ply
		
		for(MoveGenerator g : GENERATORS) {
			
			g.generateMoves(board, list);
		}
		
		return list;
	}
	
	public static MoveGenerator[] getGenerators() {
		return GENERATORS;
	}
	
}
