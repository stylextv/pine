package net.pine.command;

import net.pine.command.argument.ArgumentList;

@FunctionalInterface
public interface CommandExecutor {
	
	void execute(CommandMessage message, ArgumentList arguments);
	
}
