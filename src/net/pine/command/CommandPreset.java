package net.pine.command;

import java.util.Arrays;

import net.pine.command.argument.ArgumentList;
import net.pine.command.argument.ArgumentType;

public class CommandPreset {
	
	public static final CommandPreset TWO_INTEGERS = new CommandPreset(ArgumentType.INTEGER, 2);
	public static final CommandPreset TWO_STRINGS = new CommandPreset(ArgumentType.STRING, 2);
	
	public static final CommandPreset ONE_INTEGER = new CommandPreset(ArgumentType.INTEGER);
	public static final CommandPreset ONE_STRING = new CommandPreset(ArgumentType.STRING);
	
	public static final CommandPreset EMPTY = new CommandPreset();
	
	private ArgumentType<?>[] argumentTypes;
	
	public CommandPreset(ArgumentType<?> argumentType, int amount) {
		this(new ArgumentType[amount]);
		
		Arrays.fill(argumentTypes, argumentType);
	}
	
	public CommandPreset(ArgumentType<?>... argumentTypes) {
		this.argumentTypes = argumentTypes;
	}
	
	public ArgumentList parseMessage(CommandMessage message) {
		MessageReader reader = message.getReader();
		
		reader.reset();
		
		ArgumentList arguments = new ArgumentList();
		
		for(ArgumentType<?> type : argumentTypes) {
			
			Object argument = type.parseMessage(reader);
			
			arguments.addArgument(argument);
		}
		
		return arguments;
	}
	
	public ArgumentType<?>[] getArgumentTypes() {
		return argumentTypes;
	}
	
}
