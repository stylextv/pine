package net.pine.game.move.generate.generators;

import net.pine.game.board.Board;
import net.pine.game.board.bitboard.bitboards.AttackBitboard;
import net.pine.game.move.generate.generators.types.TableMoveGenerator;
import net.pine.game.move.list.MoveList;
import net.pine.game.piece.PieceType;

public class KingMoveGenerator extends TableMoveGenerator {
	
	public KingMoveGenerator() {
		super(PieceType.KING, AttackBitboard.KING_ATTACKS);
	}
	
	@Override
	public void generateMoves(Board board, int square, MoveList list) {
		
		
		super.generateMoves(board, square, list);
	}
	
}
