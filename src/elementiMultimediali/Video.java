package elementiMultimediali;

public class Video extends Audio implements Riproducibile, Luminosità {
	
	//Attributes
	int lumos;
	
	//Constructor 
	public Video(String t, int v, int d, int l) {
		super(t, v, d);
		this.lumos = l;
	}
	
	//Getters & Setters
	public String getTitle() {
		return title;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getDurata() {
		return durata;
	}
	
	public int getLumos() {
		return lumos;
	}
	
	public void setTitle(String t) {
		super.title = t;
	}
	
	public void  setVolume(int v) {
		this.volume = v;
	}
	
	public void setDurata(int d) {
		this.durata = d;
	}
	
	public void setLumos(int l) {
		this.lumos = l;
	}
	
	//Methods
	@Override
	public int lumosUp() {
		return --lumos;
	}

	@Override
	public int lumosDown() {
		return lumos++;
	}
	
	@Override
	public void play() {
		if (durata > 0) {
			for (int i = 0; i < durata; i++) {
				 String vPoints = "!".repeat(durata);
				 String lPoints = "*".repeat(lumos);
				 System.out.println( super.title + vPoints + lPoints);
			}
		}
	}
}
