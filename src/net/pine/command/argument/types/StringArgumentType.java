package net.pine.command.argument.types;

import net.pine.command.MessageReader;
import net.pine.command.argument.ArgumentType;

public class StringArgumentType extends ArgumentType<String> {
	
	@Override
	public String parseMessage(MessageReader reader) {
		String s = "";
		
		while(reader.hasNext()) {
			
			char ch = reader.next();
			
			if(Character.isWhitespace(ch)) break;
			
			s += ch;
		}
		
		return s;
	}
	
}
