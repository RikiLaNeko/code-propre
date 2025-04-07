package ex2;

/** Représente un livret A */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/** Débite un montant du solde
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.solde - montant >= 0) {
			this.solde -= montant;
		}
	}

	/** Applique la rémunération annuelle */
	public void appliquerRemunerationAnnuelle() {
		this.solde += this.solde * tauxRemuneration / 100;
	}

	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}