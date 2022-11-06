package net.pine.command.commands;

import net.pine.Constants;
import net.pine.command.Command;
import net.pine.command.InputController;
import net.pine.command.message.Message;

public class InfoCommand extends Command {
	
	public InfoCommand() {
		super("uci");
	}
	
	@Override
	public void execute(Message m) {
		InputController.sendMessage("id", "name", Constants.VERSIONED_NAME);
		InputController.sendMessage("id", "author", Constants.AUTHOR);
		
		
		
		InputController.sendMessage("uciok");
	}
	
}
