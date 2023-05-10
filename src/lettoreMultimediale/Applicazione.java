package lettoreMultimediale;
import elementiMultimediali.*;
import java.util.Scanner;

public class Applicazione {
	public static void main(String[] args) {
	//	Media traccia1 = new Audio("traccia1", 3, 5);
	//	Media traccia2 = new Audio("traccia2", 4, 2);
	//	Media img1 = new Immagine("img1", 4);
	//	Media img2 = new Immagine("img2", 2);
	//	Media video1 = new Video("video1", 3, 5, 2);
		
		Scanner myScanner = new Scanner(System.in);
		Media[] files = new Media[5];
		
	// For to set files
	for(int i = 0; i < 5; i++) {
		int choice, volume, durata, luminosità;
		String title;
		System.out.println("inserisci il numero per il tipo di file che vuoi caricare!");
		System.out.println("1 per audio");
		System.out.println("2 per video");
		System.out.println("3 per immagine");
		choice = myScanner.nextInt();
		
		switch(choice) {
		
			case 1:
				System.out.println("inserisci titolo per l'audio: ");
				title = myScanner.next();
				System.out.println("inserisci volume: ");
				volume = myScanner.nextInt();
				System.out.println("inserisci durata: ");
				durata = myScanner.nextInt();
				files[i] = new Audio(title, volume, durata);
				break;
				
			case 2:
				System.out.println("inserisci titolo per il video: ");
				title = myScanner.next();
				System.out.println("inserisci volume: ");
				volume = myScanner.nextInt();
				System.out.println("inserisci durata: ");
				durata = myScanner.nextInt();
				System.out.println("inserisci luminosità: ");
				luminosità = myScanner.nextInt();
				files[i] = new Video(title, volume, durata, luminosità);
				break;
				
			case 3: 
				System.out.println("inserisci titolo per l'immagine: ");
				title = myScanner.next();
				System.out.println("inserisci luminosità: ");
				luminosità = myScanner.nextInt();
				files[i] = new Immagine(title, luminosità);
				break;
				
			default:
				System.out.println("devi scegliere un tipo di file valido");
			}
		} 
	
	//While to read
	int picked =  -1;
		while (picked != 0) {
			System.out.println("digita il numero di file, da 1 a 5, per  vederlo.");
			System.out.println("oppure digita il numero 0 per chiudere il player.");
			picked = myScanner.nextInt();
		
			//If to pick
			if (1 <= picked && picked <= 5) {
				showOrPlay(files[picked - 1]);
			} else if (picked == 0) {
				System.out.println("player chiuso.");
				myScanner.close();
			} else {
				System.out.println("digita un numero valido.");
			}
		
		}
	}
	
	//Static Method
	public static void showOrPlay (Media media) {
		if (media instanceof  Audio) {
			((Audio) media).play();
		}else if(media instanceof Video) {
			((Video) media).play();
		}else if(media instanceof Immagine) {
			((Immagine) media).show();
		}
	}
	
	
}
