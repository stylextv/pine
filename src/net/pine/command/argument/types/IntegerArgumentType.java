package net.pine.command.argument.types;

import net.pine.command.MessageReader;
import net.pine.command.argument.ArgumentType;

public class IntegerArgumentType extends ArgumentType<Integer> {
	
	@Override
	public Integer parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Integer.parseInt(s);
	}
	
}
