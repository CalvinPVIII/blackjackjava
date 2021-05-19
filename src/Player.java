import java.util.ArrayList;

public class Player {
    ArrayList<Card> hand;
    int money;

    public Player(int money){
        this.money = money;
        this.hand = new ArrayList<Card>();
    }

    public Player(){
        this.money = 0;
        this.hand = new ArrayList<Card>();
    }

    public int handTotal(){
        int total = 0;
        int numberOfAces = 0;
        for (Card card : hand){
            if(card.rankAsInteger() == 1){
                numberOfAces ++;
            }else{
                total += card.rankAsInteger();
            }
            while(numberOfAces > 0) {
                if (total + 11 > 21) {
                    total += 1;
                } else {
                    total += 11;
                }
                numberOfAces--;
            }
        }
        return total;
    }

    public void addCardToHand(Card card){
        this.hand.add(card);
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void addMoney(int amount){
        this.money += amount;
    }

    public void removeMoney(int amount){
        this.money -= amount;
    }

}
