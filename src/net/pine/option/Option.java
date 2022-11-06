package net.pine.option;

public class Option {
	
	public static final Option THREADS = new Option("Threads");
	public static final Option HASH_SIZE = new Option("Hash");
	
	private static final Option[] OPTIONS = new Option[] {
			THREADS,
			HASH_SIZE
	};
	
	private String name;
	
	public Option(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public static Option getOption(String name) {
		for(Option o : OPTIONS) {
			
			String s = o.getName();
			
			if(s.equalsIgnoreCase(name)) return o;
		}
		
		return null;
	}
	
	public static Option[] getOptions() {
		return OPTIONS;
	}
	
}
