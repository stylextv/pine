package net.pine.command.argument.types;

import net.pine.command.MessageReader;
import net.pine.command.argument.ArgumentType;

public class FloatArgumentType extends ArgumentType<Float> {
	
	@Override
	public Float parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Float.parseFloat(s);
	}
	
}
