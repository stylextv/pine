package net.pine.game.move;

import net.pine.game.board.Board;
import net.pine.game.piece.Piece;

public class MoveProcessor {
	
	private Board board;
	
	public MoveProcessor(Board board) {
		this.board = board;
	}
	
	public void makeMove(int move) {
		int source = MoveSource.ofMove(move);
		int target = MoveTarget.ofMove(move);
		
		int flag = MoveFlag.ofMove(move);
		int contextSquare = MoveContext.ofMove(move);
		
		if(flag == MoveFlag.EN_PASSANT) {
			
			board.removePiece(contextSquare);
			
		} else if(flag == MoveFlag.CASTLE) {
			
			int square = (source + target) / 2;
			
			board.movePiece(contextSquare, square);
		}
		
		int piece = MovePromotion.ofMove(move);
		
		if(piece == Piece.NONE) board.getPiece(source);
		
		board.removePiece(source);
		board.setPiece(target, piece);
		
		// update board properties
	}
	
	public void unmakeMove(int move) {
		int source = MoveSource.ofMove(move);
		int target = MoveTarget.ofMove(move);
		
		int piece = board.getPiece(target);
		
		int promotionPiece = MovePromotion.ofMove(move);
		int capturedPiece = MoveCapture.ofMove(move);
		
		if(promotionPiece != Piece.NONE) piece = PAWN;
		
		board.setPiece(source, piece);
		board.setPiece(target, capturedPiece);
		
		int flag = MoveFlag.ofMove(move);
		int contextSquare = MoveContext.ofMove(move);
		
		if(flag == MoveFlag.EN_PASSANT) {
			
			board.movePiece(target, contextSquare);
			
		} else if(flag == MoveFlag.CASTLE) {
			
			int square = (source + target) / 2;
			
			board.movePiece(square, contextSquare);
		}
		
		// update board properties
	}
	
	public Board getBoard() {
		return board;
	}
	
}
