package com.game;
import com.model.DeckofCards;
import java.util.Scanner;

public class BlackJackGame{
	private DeckofCards deck;
	private Hand player;
	private DealerHand dealer;
	
	public BlackJackGame(){
	}

	private void initialize(){
        deck = new DeckofCards();
        player = new Hand();
        dealer = new DealerHand();
    }


	public void StartGame(){
	    this.initialize();
		deck.ShuffleDeck();
		player.addCard(deck.getCard());
		player.addCard(deck.getCard());
		dealer.addCard(deck.getCard());
		dealer.addCard(deck.getCard());
		System.out.println(dealer.FirstCard());
		System.out.println(player.toString() + " Score = " + player.getScore());
		PlayerChoice(player);
		DealerChoice(dealer);
		Winner();
	}
	
	private void Hit(Hand hand){
		hand.addCard(deck.getCard());
	}
	
	private void PlayerChoice(Hand hand){
		while(!hand.isBusted()){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 to Hit or 2 to Stand");
			int input = sc.nextInt();
			if(input==1){
				Hit(hand);
				System.out.println(hand.toString() + " Score = " + hand.getScore());
			}
			if(input==2){
			    break;
			}
		}
		
	}
	private void DealerChoice(Hand hand){
	    //soft 17
		while(!hand.isBusted()&& hand.getScore()<17){
			System.out.println("Dealer Hits");
			Hit(hand);
		}
		System.out.println(hand.toString() + " Score = " + hand.getScore());
		
	}
	private void Winner(){
		if(player.getScore()==dealer.getScore()){
			System.out.println("Draw game");
		}
		else if(player.isBusted()){
			System.out.println("Dealer Win");
		}
		else if(!player.isBusted() && dealer.isBusted()){
			System.out.println("Player Win");
		}
		else if(player.getScore()<dealer.getScore()){
			System.out.println("Dealer Win");
		}
		else{
			System.out.println("Player Wins");
		}
		
	}


}
