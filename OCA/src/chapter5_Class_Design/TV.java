package chapter5_Class_Design;

class Electronic {
	
	private String name;
	private int weight;
	
	
	public String getName() {
		return name;
	}


//	public Electronic(String name, int weight) {
//		super();
//		this.name = name;
//		this.weight = weight;
//	}

	
	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public static void getA(){
		System.out.println("parent");
	}
	
	
}



public class TV extends Electronic {
	
	public static void getA(){
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv = new TV();
		Electronic e = (Electronic)tv;
		
		tv.getA();
		
	}

}
