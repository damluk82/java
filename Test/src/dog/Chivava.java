package dog;

public class Chivava extends dog{

	private String name;
	
	public Chivava() {

		this.name = "Chi";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat(){
		
		System.out.println("I'm eating only a little");
		
	}
}
	
