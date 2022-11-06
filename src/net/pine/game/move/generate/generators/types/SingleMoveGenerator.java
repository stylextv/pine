package net.pine.game.move.generate.generators.types;

import net.pine.game.board.Board;
import net.pine.game.board.bitboard.Bitboard;
import net.pine.game.move.generate.MoveGenerator;
import net.pine.game.move.list.MoveList;

public abstract class SingleMoveGenerator extends MoveGenerator {
	
	public SingleMoveGenerator(int pieceType) {
		super(pieceType);
	}
	
	public abstract void generateMoves(Board board, int square, MoveList list);
	
	@Override
	public void generateMoves(Board board, int pieceColor, MoveList list) {
		int pieceType = getPieceType();
		
		int amount = board.getPieceAmount(pieceType);
		
		for(int i = 0; i < amount; i++) {
			
			int square = board.getPieceSquare(piece, i);
			
			generateMoves(board, square, list);
		}
	}
	
}
