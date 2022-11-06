package net.pine.command.commands;

import net.pine.command.Command;
import net.pine.command.CommandPreset;

public class StopCommand extends Command {
	
	public StopCommand() {
		super("stop");
		
		addExecutor(CommandPreset.EMPTY, (message, arguments) -> {
			
			
			
		});
	}
	
}
