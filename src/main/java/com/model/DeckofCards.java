package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckofCards {
	
	private ArrayList<Card> deck;

	//generate Deck
	public DeckofCards() {
		this.generateDeck();
	}

	public void generateDeck(){
		this.deck = new ArrayList<Card>();
		for(Suit i: Suit.values()){
			for(Rank j: Rank.values()){
				Card card = new Card(j,i);
				deck.add(card);
			}
		}
	}

	public void PrintDeck(){
		for(Card i:deck){
			System.out.println(i);
		}
	}
	
	public void ShuffleDeck(){
		Collections.shuffle(deck);
	}
	
	public Card getCard(){
		if (getDeckSize()>0){
			return deck.remove(0);
		}
		return null;
	}

	public int getDeckSize(){
		return deck.size();
	}

	public void emptyDeck(){
		this.deck = new ArrayList<Card>();
	}

	public List<Card> getDeck(){
		return deck;
	}
}
