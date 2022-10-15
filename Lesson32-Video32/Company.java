import java.io.Serializable;

public class Company implements Serializable{

	private String title;
	
	public Company(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
}
