import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WWE{
    public static void main(String[] args) {
        List<Card> deck = createDeck();
        Collections.shuffle(deck);
        List<Card> player1Hand = new ArrayList<>();
        List<Card> player2Hand = new ArrayList<>();
        dealCards(deck, player1Hand, player2Hand);
        playGame(player1Hand, player2Hand);
    }

    private static List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Card card = new Card("Card " + (i + 1), generatePower());
            deck.add(card);
        }
        return deck;
    }

    private static int generatePower() {
        Random rand = new Random();
        return rand.nextInt(11) + 1;
    }

    private static void dealCards(List<Card> deck, List<Card> player1Hand, List<Card> player2Hand) {
        for (int i = 0; i < deck.size(); i++) {
            Card card = deck.get(i);
            if (i % 2 == 0) {
                player1Hand.add(card);
            } else {
                player2Hand.add(card);
            }
        }
    }

    private static void playGame(List<Card> player1Hand, List<Card> player2Hand) {
        int player1Score = 0;
        int player2Score = 0;
        for (int i = 0; i < player1Hand.size(); i++) {
            Card player1Card = player1Hand.get(i);
            Card player2Card = player2Hand.get(i);
            int player1Power = player1Card.getPower();
            int player2Power = player2Card.getPower();
            System.out.println("Player 1 plays " + player1Card.getName() + " with power " + player1Power);
            System.out.println("Player 2 plays " + player2Card.getName() + " with power " + player2Power);
            if (player1Power > player2Power) {
                player1Score++;
                System.out.println("Player 1 wins!");
            } else if (player2Power > player1Power) {
                player2Score++;
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("It's a tie!");
            }
        }
        if (player1Score > player2Score) {
            System.out.println("Player 1 wins the game with a score of " + player1Score + " to " + player2Score);
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins the game with a score of " + player2Score + " to " + player1Score);
        } else {
            System.out.println("The game ends in a tie with a score of " + player1Score + " to " + player2Score);
        }
    }
}

class Card {
    private String name;
    private int power;

    public Card(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}