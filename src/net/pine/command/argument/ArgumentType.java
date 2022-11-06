package net.pine.command.argument;

import net.pine.command.MessageReader;
import net.pine.command.argument.types.BooleanArgumentType;
import net.pine.command.argument.types.CharArgumentType;
import net.pine.command.argument.types.DoubleArgumentType;
import net.pine.command.argument.types.FloatArgumentType;
import net.pine.command.argument.types.IntegerArgumentType;
import net.pine.command.argument.types.LongArgumentType;
import net.pine.command.argument.types.ShortArgumentType;
import net.pine.command.argument.types.StringArgumentType;
import net.pine.command.argument.types.UUIDArgumentType;

public class ArgumentType<T> {
	
	public static final UUIDArgumentType UUID = new UUIDArgumentType();
	
	public static final DoubleArgumentType DOUBLE = new DoubleArgumentType();
	public static final FloatArgumentType FLOAT = new FloatArgumentType();
	
	public static final LongArgumentType LONG = new LongArgumentType();
	public static final IntegerArgumentType INTEGER = new IntegerArgumentType();
	public static final ShortArgumentType SHORT = new ShortArgumentType();
	
	public static final BooleanArgumentType BOOLEAN = new BooleanArgumentType();
	
	public static final CharArgumentType CHAR = new CharArgumentType();
	public static final StringArgumentType STRING = new StringArgumentType();
	
	public T parseMessage(MessageReader reader) {
		throw new IllegalArgumentException();
	}
	
}
