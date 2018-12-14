public class Poker {
    private Cards cards;
    private Suits suits;
    public Poker (Suits suits, Cards cards){
        this.suits = suits;
        this.cards = cards;
    }

    @Override
    public String toString(){
        return this.cards.toString() + "Of" + this.suits.toString();
    }

}
