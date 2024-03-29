
package blackjack;

import java.util.Scanner;

public class Game 
{public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean stay = false;

    System.out.println("What is your name?");
    String pAnswer = scanner.nextLine();
    Player me = new Player(pAnswer);
    Player dealer = new Player("Dealer");


    System.out.println("Would you like to start a new game? Type 'YES' or 'NO' :");
    pAnswer = scanner.nextLine();

    if (pAnswer.equalsIgnoreCase("Yes")) {

        GroupOfCards deck1 = new GroupOfCards();
        Card card1 = new Card(Face.ACE, Suit.CLUBS);
        deck1.shuffleDeck();

        me.addCard(deck1.dealNextCard());
        me.addCard(deck1.dealNextCard());
        me.getPlayerHand(true);
        System.out.println(" ");
        dealer.addCard(deck1.dealNextCard());
        dealer.addCard(deck1.dealNextCard());
        dealer.getPlayerHand(false);

        //PLAYER
        do {
            System.out.println("Would " + me.getNickName() + " like to hit or stay? Type  'Hit' or 'Stay'");
            pAnswer = scanner.nextLine();
            //BUST
            if (pAnswer.equalsIgnoreCase("Hit")) {
                me.addCard(deck1.dealNextCard());
                System.out.println(me.getHandSum());
                if (me.getHandSum() > 21) {
                    System.out.println("You busted | Player Total:" + me.getHandSum() + ". Dealer wins");
                    System.exit(0);
                }
            }
            //STAY
            if (pAnswer.equalsIgnoreCase("stay")) {
                System.out.println("You have chosen to stay| Your hand: " + me.getHandSum());
            }

        } while (pAnswer.equalsIgnoreCase("Hit"));

        //DEALER
        stay = false;

        do {
            System.out.println("");
            System.out.println("- Dealers turn -");
            //DRAW CARD
            if (dealer.getHandSum() <= 15) {
                dealer.addCard(deck1.dealNextCard());
                if(dealer.getHandSum() == 15){
                    System.out.println("Blackjack! Dealer won.");
                    System.exit(0);
                }
                if (dealer.getHandSum() > 21) {
                    System.out.println("Dealer busted | Dealer Total: " + dealer.getHandSum() + ". " + me.getNickName() + " wins this time!");
                    System.exit(0);
                }
            } else {
                System.out.println("Dealer has chosen to stay!");
                int totalDealerSum = dealer.getHandSum();
                int totalPlayerSum = me.getHandSum();

                if(totalDealerSum > totalPlayerSum){
                    System.out.println("Both players have decided to stay. The winner is " + dealer.getNickName() + " with a total of " +  totalDealerSum + ".");
                } else {
                    System.out.println("Both players have decided to stay. The winner is " + me.getNickName() + " with a total of " + totalPlayerSum + ".");
                }
                stay = false;
            }

        } while (stay);
    }
}

 public static boolean checkLength(String pAnswer)
    {
        if(pAnswer.length()>=1 && pAnswer.length() <=12)
        {
            return true;
        }
        return false;
    }
   
}


