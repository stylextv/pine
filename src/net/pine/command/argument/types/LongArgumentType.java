package net.pine.command.argument.types;

import net.pine.command.MessageReader;
import net.pine.command.argument.ArgumentType;

public class LongArgumentType extends ArgumentType<Long> {
	
	@Override
	public Long parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Long.parseLong(s);
	}
	
}
