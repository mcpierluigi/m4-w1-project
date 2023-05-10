package elementiMultimediali;

public class Audio extends Media implements Riproducibile {
	
	//Attributes
	int volume;
	int durata;
	
	//Constructor
	public Audio(String t, int v, int d) {
		super.title = t;
		this.volume = v;
		this.durata = d;
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
	
	public void setTitle(String t) {
		super.title = t;
	}
	
	public void  setVolume(int v) {
		this.volume = v;
	}
	
	public void setDurata(int d) {
		this.durata = d;
	}
	
	//Methods
	public int volumeUp() {
		return --volume;
	}
	
	public int volumeDown() {
		return volume++;
	}
	
	public void printAudio() {
		System.out.println("Titolo: " + super.title);
		System.out.println("Volume: " + this.volume);
		System.out.println("Durata: " + this.durata);
	}
	
	@Override
	public void play() {
		if (durata > 0) {
			for (int i = 0; i < durata; i++) {
				 String vPoints = "!".repeat(durata);
				System.out.println( super.title + vPoints);
			}
		}
	}
	
}
