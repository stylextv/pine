package net.pine.command.argument.types;

import net.pine.command.MessageReader;
import net.pine.command.argument.ArgumentType;

public class DoubleArgumentType extends ArgumentType<Double> {
	
	@Override
	public Double parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Double.parseDouble(s);
	}
	
}
