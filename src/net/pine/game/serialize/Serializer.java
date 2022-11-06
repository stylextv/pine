package net.pine.game.serialize;

import java.util.HashMap;

public class Serializer {
	
	public static final Serializer SQUARE_FILE = new Serializer(3);
	public static final Serializer SQUARE_RANK = new Serializer(3);
	
	public static final Serializer SQUARE = new Serializer(SQUARE_FILE, SQUARE_RANK);
	
	public static final Serializer PIECE_COLOR = new Serializer(2);
	public static final Serializer PIECE_TYPE = new Serializer(3);
	
	public static final Serializer PIECE = new Serializer(PIECE_COLOR, PIECE_TYPE);
	
	public static final Serializer MOVE_TYPE = new Serializer(1);
	public static final Serializer MOVE_FLAG = new Serializer(3);
	public static final Serializer MOVE_SOURCE = new Serializer(SQUARE);
	public static final Serializer MOVE_TARGET = new Serializer(SQUARE);
	public static final Serializer MOVE_CONTEXT = new Serializer(SQUARE);
	public static final Serializer MOVE_CAPTURE = new Serializer(PIECE);
	public static final Serializer MOVE_PROMOTION = new Serializer(PIECE);
	
	public static final Serializer MOVE = new Serializer(MOVE_TYPE, MOVE_FLAG, MOVE_SOURCE, MOVE_TARGET, MOVE_CONTEXT);
	
	private int length;
	
	private HashMap<Serializer, Integer> offsets = new HashMap<>();
	
	public Serializer(Serializer... serializers) {
		for(Serializer s : serializers) {
			
			addComponent(s);
		}
	}
	
	public Serializer(int length) {
		this.length = length;
	}
	
	private void addComponent(Serializer s) {
		offsets.put(s, length);
		
		length += s.getLength();
	}
	
	public int getComponent(int object, Serializer s) {
		
	}
	
	public int setComponent(int object, Serializer s, int value) {
		int offset = getOffset(s);
		
		value 
	}
	
	private int getOffset(Serializer s) {
		return offsets.get(s);
	}
	
	public int getLength() {
		return length;
	}
	
}
