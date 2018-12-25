package com.game;

import com.model.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	protected List<Card> cards;
	protected int score;
	protected boolean Ace;

	public Hand() {
		cards = new ArrayList<Card>();
		score = 0;
		Ace = false;
	}

	public void addCard(Card card){
		cards.add(card);
        if(card.getRank().getvalue()>=10){
            score += tenPoint();
        }
        else if(card.getRank().getvalue()==1){
            if(Ace == true){
                score+=card.getRank().getvalue();
            }
            else{
                Ace = true;
            }
        }
        else{
            score+= card.getRank().getvalue();
        }
	}

	@Override
	public String toString() {
		return "PlayerHand [cards=" + cards  + "]";
	}

	public int getScore(){
        if(Ace==true){
            if(score<11){
                return score+11;
            }
            else{
                return score+1;
            }
        }
		return score;
	}
	
	public int aceValue()//ace Value
	{
		if(score<11){
			return 11;
		}
		return 1;
	}
	public int tenPoint()//10 , jack , queen , king value
	{
		return 10;
	}
		
	public boolean isBusted(){
		return getScore()>21;
	}
	
	
}
