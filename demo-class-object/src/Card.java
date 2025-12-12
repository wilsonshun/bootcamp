public class Card {
    private RANK rank; // int long char // A 2 3 4 5 6 7 8 9 T J Q K 
    private char suit; // suit; D C H S 

    // constructor 
    public Card(Rank rank, char suit) {
        this.rank = rank; 
        this.suit = suit; 
    }

    public Card(char rankValue, int seq, char suit) {
        this.rank = new Rank(rankValue, seq); 
        this.suit = suit; 
    }

    public static Card ofAce(char suit) {
        return new Card('A', 12, suit); 
    }

    // get 
    public char getRank() {
        return rank; 
    }
    public char getSuit() {
        return suit;
    }  

    // ! No setter 
  
    public String toString() {
        return "Card(" // 
        + "rank=" + this.rank //
        + ",suit=" + this.suit // 
        + ")"; 
    }

    public static void main(String[] args) {
        Card.ofAce('D'); // static method -> constructor 
        String.valueOf('C'); // static method -> constructor 


    }
}
