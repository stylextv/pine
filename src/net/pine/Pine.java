package net.pine;

import net.pine.command.InputController;

public class Pine {
	
	private static Pine instance;
	
	public Pine() {
		instance = this;
	}
	
	public void onStart() {
		InputController.sendMessage(Constants.VERSIONED_NAME + " by " + Constants.AUTHOR);
		
		InputController.start();
	}
	
	public static Pine getInstance() {
		return instance;
	}
	
}
