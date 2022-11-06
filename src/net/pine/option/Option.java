package net.pine.option;

import net.pine.util.object.NamedObject;

public class Option extends NamedObject {
	
	public static final Option THREADS = new Option("Threads");
	public static final Option HASH_SIZE = new Option("Hash");
	
	private static final Option[] OPTIONS = new Option[] {
			THREADS,
			HASH_SIZE
	};
	
	public Option(String name) {
		super(name);
	}
	
	public static Option getOption(String name) {
		return (Option) NamedObject.probeArray(OPTIONS, name);
	}
	
	public static Option[] getOptions() {
		return OPTIONS;
	}
	
}
