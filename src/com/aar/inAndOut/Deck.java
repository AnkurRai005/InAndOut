package com.aar.inAndOut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Cards> cards;
	
	public Deck(){
		setCards();
	}
	
	protected List<Cards> getCards() {
		return cards;
	}

	protected void setCards() {
		List<Cards> addCards = new ArrayList<Cards>();
		for(int i = 1; i < 14; i++) {
			for(int j = 1; j < 5; j++) {
				addCards.add(new Cards(i,j));
			}
		}
		this.cards = addCards;
	}

	public List<Cards> shuffle(){
		List<Cards> shuffledCards = new ArrayList<>(getCards());
		Collections.shuffle(shuffledCards);
		return shuffledCards;
	}
	
	public Cards deal(List<Cards> cards) {
		return cards.remove(0);
	}
}
