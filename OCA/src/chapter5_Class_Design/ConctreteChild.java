package chapter5_Class_Design;

public class ConctreteChild extends AbstactParent{
	
	String name;
	public String Planet = "Earth";
	
	public String getName(){
		
		super.name = "egy";
		name = "kett�";
		
		System.out.println(name + " " + super.name);
		
		return "hal";};
	
	
		
		
	public String getPlanet() {
		return Planet + " " +  super.Planet;
	}




	public void setPlanet(String planet) {
		Planet = planet;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConctreteChild child = new ConctreteChild();
		
		child.getName();
		System.out.println(child.getPlanet());;
		
	}

}