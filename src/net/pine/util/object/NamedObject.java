package net.pine.util.object;

public class NamedObject {
	
	private String name;
	
	public NamedObject(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static NamedObject probeArray(NamedObject[] objects, String name) {
		for(NamedObject object : objects) {
			
			String s = object.getName();
			
			if(s.equals(name)) return object;
		}
		
		return null;
	}
	
}
