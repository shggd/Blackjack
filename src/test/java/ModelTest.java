import com.model.Card;
import com.model.DeckofCards;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class ModelTest {

    @Test
    public void DeckTest(){
        DeckofCards deck = new DeckofCards();

        Assert.assertEquals(deck.getDeckSize(),52);//deck size
        Assert.assertThat(deck.getCard(),instanceOf(Card.class));//make sure get a card

        deck.emptyDeck();
        Assert.assertEquals(deck.getDeckSize(),0);//check if empty deck
        Assert.assertEquals(deck.getCard(),null);//get card from empty deck
        DeckofCards newDeck = new DeckofCards();
        deck.ShuffleDeck();
        Assert.assertNotEquals(deck.getDeck(),newDeck.getDeck());//shuffle deck
    }

}
