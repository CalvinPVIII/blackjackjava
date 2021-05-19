public class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }

    public int rankAsInteger(){
        if (this.rank.equals("Ace")){
            return 1;
        }
        if(this.rank.equals("Jack") || this.rank.equals("Queen") || this.rank.equals("King")) {
            return 10;
        }
        return Integer.valueOf(this.suit);
    }

    public String getSuit(){
        return this.suit;
    }

    public String getRank(){
        return this.rank;
    }


    public String toString(){
        return this.rank + " of " + rank +"s";
    }

}
