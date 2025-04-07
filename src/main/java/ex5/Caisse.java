package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private List<Item> items;
	private int poidsMin;
	private int poidsMax;

	/** Constructeur
	 * @param nom nom de la caisse
	 * @param poidsMin poids minimum accepté
	 * @param poidsMax poids maximum accepté (utiliser Integer.MAX_VALUE pour sans limite)
	 */
	public Caisse(String nom, int poidsMin, int poidsMax) {
		this.nom = nom;
		this.poidsMin = poidsMin;
		this.poidsMax = poidsMax;
		this.items = new ArrayList<>();
	}

	/** Vérifie si la caisse peut accepter l'item en fonction de son poids
	 * @param item l'item à vérifier
	 * @return true si l'item peut être accepté, false sinon
	 */
	public boolean peutAccepter(Item item) {
		int poids = item.getPoids();
		return poids >= poidsMin && poids <= poidsMax;
	}

	/** Ajoute un item dans la caisse
	 * @param item l'item à ajouter
	 * @return true si l'item a été ajouté, false sinon
	 */
	public boolean ajouterItem(Item item) {
		if (peutAccepter(item)) {
			items.add(item);
			return true;
		}
		return false;
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/** Retourne le nombre d'items dans la caisse
	 * @return le nombre d'items
	 */
	public int nombreItems() {
		return items.size();
	}
}