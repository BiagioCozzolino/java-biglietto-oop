package jana60;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int eta = 0, km;

		System.out.println("Ciao, benvenuto/a nella biglietteria!");
		do {
			System.out.print("Inserisci la tua età: ");
			eta = Integer.parseInt(scan.nextLine());
			if (eta < 1) // ma se l'età è minore di 1, do errore e chiedo di nuovo
				System.out.println("Inserisci un età veritiera, non puoi avere meno di 1 anno!");

		} while (eta < 1);
		do {
			System.out.println("Inserisci il numero di kilometri ");
			km = Integer.parseInt(scan.nextLine());

			if (km < 1)
				System.out
						.println("Inserisci un numero di kilometro veritiera! Non puoi viaggiare meno di 1 kilometro");
		} while (km < 1);

		Biglietto nuovocliente = new Biglietto(eta, km);

		System.out.println(nuovocliente.messaggioFinale());

		scan.close();
	}

}
