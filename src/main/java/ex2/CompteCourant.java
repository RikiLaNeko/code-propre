package ex2;

/** Représente un compte courant */
public class CompteCourant extends CompteBancaire {

    /** decouvert : un découvert est autorisé seulement pour les comptes courants */
    private double decouvert;

    /**
     * @param solde
     * @param decouvert
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    /** Débite un montant du solde
     * @param montant
     */
    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= -decouvert) {
            this.solde -= montant;
        }
    }

    /** Getter for decouvert
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /** Setter
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}