package net.pine.game.move.list;

import net.pine.game.move.Move;
import net.pine.game.move.constraint.MoveConstraint;

public class MoveList {
	
	private static final int 
	
	private int[] moves;
	
	private int size;
	
	public MoveList() {
		this();
	}
	
	public MoveList(int size) {
		moves = new int[size];
	}
	
	public int nextLegalMove() {
		// use MoveConstraint and #nextMove
	}
	
	public int nextMove() {
		
	}
	
	public void addMove(int move) {
		moves[size] = move;
		
		size++;
	}
	
	public void clear() {
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public int[] getMoves() {
		return moves;
	}
	
}
