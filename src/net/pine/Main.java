package net.pine;

import net.pine.util.exception.ExceptionUtil;

public class Main {
	
	public static void main(String[] args) {
		Pine pine = new Pine();
		
		ExceptionUtil.catchExceptions(() -> pine.onStart());
	}
	
}
