public class Deck {
    // ! static // 公家嘢但無人佔有 // does not belong to any Object // dictionary 
    public static char ACE = 'A'; 
    public static char TWO = '2'; 


    public static char[] RANKS = new char[] // 
    {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'}; 
    public static char[] SUITS = new char[] // {'D', 'C', 'H', 'S'};

    // ! Attributes
    private Card[] cards; 

    // how to control a deck has 52 cards ONLY? 
    public Deck() {
        this.cards = new Card[RANKS.length * SUITS.length]; 
        int idx = 0; 
        for (char suit : SUITS) {
            for (char rank : RANKS) {
                this.cards[idx++] = new Card(rank, suit); 
            }
        }
    }

    public Card[] getCards() {
        return this.cards; 
    }

    public static void main(String[] args) {
        Deck d1 = new Deck(); 
        System.out.println(d1.getCards()[0].getRank()); // A
        System.out.println(d1.getCards()[0].getSuit()); // D
    }
}
