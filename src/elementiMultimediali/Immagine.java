package elementiMultimediali;

public class Immagine extends Media implements Luminosità {
	
	//Attributes
	int lumos;
	
	//Constructor
	public Immagine(String t, int l) {
		super.title = t;
		this.lumos = l;
	}
	
	//Getters & Setters
	public String getTitle() {
		return title;
	}
	
	public int getLumos() {
		return lumos;
	}
	
	public void setTitle(String t) {
		super.title = t;
	}
	
	public void setLumos(int l) {
		this.lumos = l;
	}
	
	//Methods
	public void show() {
		if (lumos > 0) {
			for (int i = 0; i < lumos; i++) {
				 String lPoints = "*".repeat(lumos);
				System.out.println( super.title + lPoints);
			}
		}
	}

	@Override
	public int lumosUp() {
		return lumos++;
	}

	@Override
	public int lumosDown() {
		return --lumos;
	}
}
