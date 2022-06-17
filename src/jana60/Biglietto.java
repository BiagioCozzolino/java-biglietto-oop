package jana60;

import java.text.DecimalFormat;

public class Biglietto {

	// Attributi
	private double prezzoKm = 0.21, scontoGiov = 0.2, scontoAnz = 0.4;
	private int etaPasseggero;
	private double kilometri;

	DecimalFormat df = new DecimalFormat("#0.00€");

	// Getter e setter

	public double getKilometri() {
		return kilometri;
	}

	public void setKilometri(double kilometri) {
		this.kilometri = kilometri;
	}

	public int getEtaPasseggero() {
		return etaPasseggero;
	}

	public void setEtaPasseggero(int etaPasseggero) {
		this.etaPasseggero = etaPasseggero;
	}

	// Costruttore
	public Biglietto(int etaPasseggero, int kilometri) {
		super();
		this.kilometri = kilometri;
		this.etaPasseggero = etaPasseggero;
	}

	// Metodi

	public double calcoloPrezzo() {
		double prezzoIniziale = 0.0;
		prezzoIniziale = kilometri * prezzoKm;
		if (etaPasseggero > 65) {
			return prezzoIniziale - (prezzoIniziale * scontoAnz);
		} else if (etaPasseggero < 18) {
			return prezzoIniziale - (prezzoIniziale * scontoGiov);
		} else {
			return prezzoIniziale;
		}
	}

	public String formattaPrezzo() // riporto il prezzo formattato alla seconda cifra decimale
	{
		return df.format((calcoloPrezzo()));
	}

	public String messaggioFinale() {
		String messaggio = "";
		if (etaPasseggero > 65) {
			messaggio += "Complimenti hai diritto al 40% di sconto";
		} else if (etaPasseggero < 18) {
			messaggio += "Complimenti hai diritto al 20% di sconto";
		} else {
			messaggio += "Mi dispiace non hai diritto a nessuno sconto";
		}
		return messaggio += "\n Il costo finale del biglietto è di" + formattaPrezzo();

	}

}
