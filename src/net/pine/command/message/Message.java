package net.pine.command.message;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Message {
	
	private String name;
	
	private HashMap<String, String> values = new LinkedHashMap<>();
	
	public Message(String name, String[] args) {
		this.name = name;
		
		for(int i = 0; i < args.length - 1; i += 2) {
			
			String key = args[i];
			String value = args[i + 1];
			
			setValue(key, value);
		}
	}
	
	@Override
	public String toString() {
		String s = name;
		
		for(Entry<String, String> e : values.entrySet()) {
			
			String key = e.getKey();
			String value = e.getValue();
			
			s = String.join(" ", s, key, value);
		}
		
		return s;
	}
	
	public boolean hasValue(String key) {
		return values.containsKey(key);
	}
	
	public String getValue(String key) {
		return values.get(key);
	}
	
	public void setValue(String key, String value) {
		values.put(key, value);
	}
	
	public boolean hasAtLeast(int l) {
		return size() >= l;
	}
	
	public boolean hasAtMost(int l) {
		return size() <= l;
	}
	
	public boolean hasMoreThan(int l) {
		return size() > l;
	}
	
	public boolean hasLessThan(int l) {
		return size() < l;
	}
	
	public boolean hasExactly(int l) {
		return size() == l;
	}
	
	public int size() {
		return values.size();
	}
	
	public String getName() {
		return name;
	}
	
	public static Message fromString(String s) {
		String[] split = s.split(" ");
		
		String name = split[0];
		
		return new Message(name, split);
	}
	
}
