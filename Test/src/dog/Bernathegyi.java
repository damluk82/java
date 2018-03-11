package dog;

public class Bernathegyi extends dog {

	int b;
	
	
	private String name;

	public Bernathegyi() {
		this.name = "Bern";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void eat(){
		int a;
		System.out.println("I'm eating a lot" + b);
		
	}
}
	
