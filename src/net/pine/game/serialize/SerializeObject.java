package net.pine.game.serialize;

public class SerializeObject {
	
	private static final int[] MASKS = new int[Integer.SIZE];
	
	public static final int EMPTY = 0;
	
	static {
		for(int i = 0; i < MASKS.length; i++) {
			
			int mask = shift(1, i);
			
			MASKS[i] = mask - 1;
		}
	}
	
	public static int shift(int object, int amount) {
		if(amount < 0) return object >> -amount;
		
		return object << amount;
	}
	
	// TODO rename?
	public static int intersect(int object1, int object2) {
		return object1 & object2;
	}
	
	public static int combine(int object1, int object2) {
		return object1 | object2;
	}
	
	public static int ofMask(int length, int offset) {
		int object = ofMask(length);
		
		return shift(object, offset);
	}
	
	public static int ofMask(int length) {
		return MASKS[length];
	}
	
}
