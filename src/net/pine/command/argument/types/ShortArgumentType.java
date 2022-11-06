package net.pine.command.argument.types;

import net.pine.command.MessageReader;
import net.pine.command.argument.ArgumentType;

public class ShortArgumentType extends ArgumentType<Short> {
	
	@Override
	public Short parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Short.parseShort(s);
	}
	
}
