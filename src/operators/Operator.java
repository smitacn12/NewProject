package operators;

public class Operator {
	
	private String name;
	private String city;
	
	
	public String getName() {
		return name;
		
	}
	public String getCity() {
		return city;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public Operator(String name, String city)
	{
		this.name = name;
		this.city = city;
	
	}
	public static void main(String[] args) {
		Operator v = new Operator("Smita", "Pusad");
		v.setName("Smmmmmm");
		System.out.println("this is city name   " + v.getCity()+ "  my name is   " + v.getName());
		
	}

}
