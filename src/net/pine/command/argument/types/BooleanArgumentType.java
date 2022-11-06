package net.pine.command.argument.types;

import net.pine.command.MessageReader;
import net.pine.command.argument.ArgumentType;

public class BooleanArgumentType extends ArgumentType<Boolean> {
	
	@Override
	public Boolean parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Boolean.parseBoolean(s);
	}
	
}
