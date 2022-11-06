package net.pine.command.commands;

import net.pine.command.Command;
import net.pine.command.message.Message;

public class NewGameCommand extends Command {
	
	public NewGameCommand() {
		super("ucinewgame");
	}
	
	@Override
	public void execute(Message m) {
		// TODO clear TT and such?
	}
	
}
