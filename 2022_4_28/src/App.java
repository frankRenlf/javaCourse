import card.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class App {

    public static final String[] suits = {"♥", "♠", "♦", "♣"};

    public static List<Card> cards() {
        List<Card> ret = new ArrayList<>();
        for (String x : suits) {
            for (int i = 1; i <= 13; i++) {
                // Card card = new Card(x, i);
                ret.add(new Card(x, i));
            }
        }
        return ret;
    }

    private static void swap(List<Card> cards, int l, int r) {
        Card tmp = cards.get(l);
        cards.set(l, cards.get(r));
        cards.set(r, tmp);
    }

    public static void shuffle(List<Card> cards) {
        for (int i = cards.size() - 1; i > 0; i--) {
            Random random = new Random();
            int index = random.nextInt(i);
            swap(cards, i, index);
        }
    }

    public static void main(String[] args) {
        List<Card> cardList = cards();
        System.out.println("Origin: " + cardList);
        shuffle(cardList);
        System.out.println("Random: " + cardList);

        List<List<Card>> hands = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            hands.add(new ArrayList<>());
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                hands.get(j).add(cardList.remove(0));
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(hands.get(i));
        }
        System.out.println("Leave: " + cardList.size());

    }

    public static void main2(String[] args) {
        Random random = new Random();
        for (int i = 1; i < 20; i++) {
            System.out.println(random.nextInt(5));
        }
        System.out.println();
    }

}
