package net.pine.command.commands;

import net.pine.command.Command;
import net.pine.command.InputController;
import net.pine.command.message.Message;

public class ReadyCommand extends Command {
	
	public ReadyCommand() {
		super("isready");
	}
	
	@Override
	public void execute(Message m) {
		InputController.sendMessage("readyok");
	}
	
}
