package accessspecifier;

public class ac3 {
	
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ac3 f = new ac3();
		f.setName("Shankar");
		System.out.println(f.getName());

	}

}
