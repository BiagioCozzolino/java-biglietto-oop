package jana60;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int eta = 0, km;
		String nuovoBiglietto = "";

		do {
			System.out.println("Ciao, benvenuto/a nella biglietteria!");
			do {
				System.out.print("Inserisci la tua età: ");
				eta = Integer.parseInt(scan.nextLine());
				if (eta < 1) // ma se l'età è minore di 1, do errore e chiedo di nuovo
					System.out.println("Inserisci un età veritiera, non puoi avere meno di 1 anno!");

			} while (eta < 1);
			do {
				System.out.print("Inserisci il numero di kilometri ");
				km = Integer.parseInt(scan.nextLine());

				if (km < 1)
					System.out.println(
							"Inserisci un numero di kilometro veritiera! Non puoi viaggiare meno di 1 kilometro");
			} while (km < 1);

			Biglietto nuovocliente = new Biglietto(eta, km);

			System.out.println(nuovocliente.messaggioFinale());

			String scelta = "";
			do {

				System.out.print("Vuoi comprare un nuovo biglietto? Rispondi solo Si o No");
				scelta = scan.nextLine();
				if (scelta.equalsIgnoreCase("Si")) {
					nuovoBiglietto = "Si";
				} else if (scelta.equalsIgnoreCase("No")) {
					nuovoBiglietto = "No";
				} else if (!scelta.equalsIgnoreCase("Si") && !scelta.equalsIgnoreCase("No")) {
					System.out.println("Non hai scritto un carattere corretto rispondi Si o No!");
				}

			} while (!scelta.equalsIgnoreCase("Si") && !scelta.equalsIgnoreCase("No"));

		} while (nuovoBiglietto.equalsIgnoreCase("Si"));

		System.out.println("Grazie per averci scelto, Buona giornata!");

		scan.close();
	}

}
