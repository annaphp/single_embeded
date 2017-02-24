package anna.model;

import javax.persistence.Embeddable;

@Embeddable
public class Insole {
	int size;
	String category;
	
	
	public Insole() {
	}

	public Insole(int size, String category) {
		this.size = size;
		this.category = category;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Insole [size=" + size + ", category=" + category + "]";
	}
	
	
}
