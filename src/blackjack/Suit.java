/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

public enum Suit {

HEARTS(" Hearts"),
SPADES(" Spades"),
DIAMONDS(" Diamonds"),
CLUBS(" Clubs");

private final String suitText;

private Suit(String suitText){
    this.suitText = suitText;
}

public String PrintSuitText(){
    return suitText;
}
}