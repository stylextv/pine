package net.pine.command.commands;

import net.pine.command.Command;
import net.pine.command.CommandPreset;
import net.pine.command.InputController;

public class QuitCommand extends Command {
	
	public QuitCommand() {
		super("quit");
		
		addExecutor(CommandPreset.EMPTY, (message, arguments) -> {
			
			InputController.stop();
			
		});
	}
	
}
