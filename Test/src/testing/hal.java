package testing;

public class hal {

	public hal(String name) {
		setName(name);
		//this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hal hal = new hal("ponty");
		
		System.out.println(hal.getName());
		
	}

}
