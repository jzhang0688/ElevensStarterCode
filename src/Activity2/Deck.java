package Activity2;
import Activity2.Card;

import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;
    private List<Card> dealtcards;
    private List<Card> shuffled;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;



    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        cards = new ArrayList<Card>();
        dealtcards = new ArrayList<Card>();
        shuffled = new ArrayList<Card>();

        for(int i = 0; i < ranks.length; i++)
        {
            for(int o; o < suits.length; o++) {
                cards.add(new Card(ranks[i], suits[o], values[i]));
            }
        }
        size = cards.size();
    }


    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
		if (size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
		return size();
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */



    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */

    public void shuffle()
    {
        int k = 0;
        for(int j = 0; j<=25; j++)
        {
            shuffled.set(k, cards.get(j));
            k = k+2;
        }
        k = 1;
        for (int j = 26; j <= 51; j++)
        {
            shuffled.set(k, cards.get(j));
            k = k+2;
        }
    }

    public Card deal() {
        if (size == 0)
        {
            return null;
        }
        else
        {
            dealtcards.add(cards.get(cards.size()));
            cards.remove(cards.size());
            return dealtcards.get(dealtcards.size());
        }

    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
