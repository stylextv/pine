package net.pine.command;

import java.util.HashMap;
import java.util.LinkedHashMap;

import net.pine.command.argument.ArgumentList;
import net.pine.command.commands.QuitCommand;
import net.pine.command.commands.StopCommand;
import net.pine.util.exception.ExceptionUtil;
import net.pine.util.object.NamedObject;

public class Command extends NamedObject {
	
	public static final Command TUNNEL = new TunnelCommand();
	public static final Command THIS_WAY = new ThisWayCommand();
	public static final Command AXIS = new AxisCommand();
	public static final Command ORIGIN = new OriginCommand();
	public static final Command GOTO = new GotoCommand();
	
	public static final Command STOP = new StopCommand();
	public static final Command QUIT = new QuitCommand();
	
	private static final Command[] COMMANDS = new Command[] {
			QUIT, STOP,
			GOTO, ORIGIN, AXIS, THIS_WAY, TUNNEL
	};
	
	private HashMap<CommandPreset, CommandExecutor> executors = new LinkedHashMap<>();
	
	public Command(String name) {
		super(name);
	}
	
	public void addExecutor(CommandPreset preset, CommandExecutor executor) {
		executors.put(preset, executor);
	}
	
	public boolean parseMessage(CommandMessage message) {
		for(CommandPreset preset : executors.keySet()) {
			
			boolean parsed = parseMessage(message, preset);
			
			if(parsed) return true;
		}
		
		return false;
	}
	
	public boolean parseMessage(CommandMessage message, CommandPreset preset) {
		return !ExceptionUtil.catchExceptions(() -> {
			
			ArgumentList arguments = preset.parseMessage(message);
			
			parseMessage(message, preset, arguments);
			
		}, (exception) -> message.setException(exception));
	}
	
	public void parseMessage(CommandMessage message, CommandPreset preset, ArgumentList arguments) {
		CommandExecutor executor = executors.get(preset);
		
		executor.execute(message, arguments);
	}
	
	public HashMap<CommandPreset, CommandExecutor> getExecutors() {
		return executors;
	}
	
	public static Command getCommand(String name) {
		return (Command) NamedObject.probeArray(COMMANDS, name);
	}
	
	public static Command[] getCommands() {
		return COMMANDS;
	}
	
}
