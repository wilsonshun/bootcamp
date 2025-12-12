public class Card {
    private char rank; // int long char // A 2 3 4 5 6 7 8 9 T J Q K 
    private char suit; // suit; D C H S 

    // constructor 
    public Card(char rank, char suit) {
        this.rank = rank; 
        this.suit = suit; 
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
}
