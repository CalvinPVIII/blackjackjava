import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    private ArrayList<Card> deck;



    public Deck(){
        this.deck = new ArrayList<Card>();
    }

    public Deck(ArrayList<Card>deck){
        this.deck = deck;
    }

    public void populateDeck(){
        String[] suits = {"Club", "Spade", "Heart", "Diamond"};
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (String suit : suits ){
            for (String rank : ranks){
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }
    }

    public ArrayList<Card> getDeck(){
        return this.deck;
    }
    public Card drawCard(){
        Card card = this.deck.get(1);
        this.deck.remove(1);
        return card;
    }

    public void shuffle(){
        Collections.shuffle(this.deck);
    }

    public void addCard(Card card){
        deck.add(card);
    }

    public void combineDecks(Deck deck){
        this.deck.addAll(deck.getDeck());
    }


}
