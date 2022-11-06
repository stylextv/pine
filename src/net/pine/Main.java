package net.pine;

import net.pine.util.ExceptionUtil;

public class Main {
	
	public static void main(String[] args) {
		Pine pine = new Pine();
		
		ExceptionUtil.catchEverything(() -> pine.onStart());
	}
	
}
