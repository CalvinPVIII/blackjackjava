import java.util.ArrayList;

public class GameLogic {
    private Deck gameDeck;
    private Player player;
    private ArrayList<Card> dealerHand;


    public GameLogic(Deck gameDeck, Player player){
        this.gameDeck = gameDeck;
        this.player = player;
        this.dealerHand = new ArrayList<Card>();
    }



}
