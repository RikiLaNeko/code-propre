package ex5;

/**
 * Exception levée lorsqu'un item ne peut être placé dans aucune caisse
 */
public class ItemNonAccepteException extends RuntimeException {

    public ItemNonAccepteException(Item item) {
        super("Aucune caisse ne peut accepter l'item \"" + item.getNom() +
                "\" de poids " + item.getPoids());
    }
}