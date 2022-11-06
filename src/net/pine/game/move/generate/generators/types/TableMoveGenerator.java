package net.pine.game.move.generate.generators.types;

import net.pine.game.board.Board;
import net.pine.game.board.bitboard.Bitboard;
import net.pine.game.move.list.MoveList;

public class TableMoveGenerator extends SingleMoveGenerator {
	
	private long[] attackBitboards;
	
	public TableMoveGenerator(int pieceType, long[] attackBitboards) {
		super(pieceType);
		
		this.attackBitboards = attackBitboards;
	}
	
	@Override
	public void generateMoves(Board board, int square, MoveList list) {
		long bb = attackBitboards[square];
		
		Bitboard.forEachSquare(bb, (target) -> {
			
			
			
		});
	}
	
	public long[] getAttackBitboards() {
		return attackBitboards;
	}
	
}
