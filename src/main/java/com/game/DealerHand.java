package com.game;

public class DealerHand extends Hand {
	
	public String FirstCard(){
		int point;
		if(cards.get(0).getRank().getvalue()>=10){
			point = tenPoint();
		}else{
			point = cards.get(0).getRank().getvalue();
		}
		return "DealerHand [cards=" + cards.get(0) + ", [Face Down Card]] Faceup value = " + point;
	}

	public String toString() {
		return "DealerHand [cards=" + cards +  "]";
	}


}
