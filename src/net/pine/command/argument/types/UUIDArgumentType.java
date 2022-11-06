package net.pine.command.argument.types;

import java.util.UUID;

import net.pine.command.MessageReader;
import net.pine.command.argument.ArgumentType;

public class UUIDArgumentType extends ArgumentType<UUID> {
	
	@Override
	public UUID parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return java.util.UUID.fromString(s);
	}
	
}
