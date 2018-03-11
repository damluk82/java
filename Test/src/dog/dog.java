package dog;

import java.util.Properties;

public class dog {

	byte B;
	private String name;
	
	public dog() {
		super();
		this.name = "Simple dog";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat(){
		
		byte miez = 1_1_1;
		
		
		System.out.println("I'm eating");
		System.out.println(B + miez);
		Properties properties = System.getProperties();
		System.out.println(properties.getProperty("kedvencFank"));
		System.out.println(properties.getProperty("file.separator"));
		
	}
	
	
}
	
