package net.pine.game.move.generate.generators;

import net.pine.game.board.bitboard.bitboards.AttackBitboard;
import net.pine.game.move.generate.generators.types.TableMoveGenerator;
import net.pine.game.piece.PieceType;

public class KnightMoveGenerator extends TableMoveGenerator {
	
	public KnightMoveGenerator() {
		super(PieceType.KNIGHT, AttackBitboard.KNIGHT_ATTACKS);
	}
	
}
