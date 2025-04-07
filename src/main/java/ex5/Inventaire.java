package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0, 4));
		caisses.add(new Caisse("Moyens objets", 5, 20));
		caisses.add(new Caisse("Grands objets", 21, Integer.MAX_VALUE));
	}

	/**
	 * Ajoute un item dans une caisse appropriée
	 * @param item l'item à ajouter
	 * @throws ItemNonAccepteException si aucune caisse ne peut accepter l'item
	 */
	public void addItem(Item item) {
		for (Caisse caisse : caisses) {
			if (caisse.ajouterItem(item)) {
				return;
			}
		}
		// Levée d'une exception si aucune caisse n'accepte l'item
		throw new ItemNonAccepteException(item);
	}

	/**
	 * Calcule le nombre total d'items dans toutes les caisses
	 * @return le nombre total d'items
	 */
	public int taille() {
		int total = 0;
		for (Caisse caisse : caisses) {
			total += caisse.nombreItems();
		}
		return total;
	}

	/**
	 * Getter pour l'attribut caisses
	 * @return the caisses
	 */
	public List<Caisse> getCaisses() {
		return caisses;
	}

	/**
	 * Ajoute une nouvelle caisse à l'inventaire
	 * @param caisse la caisse à ajouter
	 */
	public void ajouterCaisse(Caisse caisse) {
		caisses.add(caisse);
	}
}