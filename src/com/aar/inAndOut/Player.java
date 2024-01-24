package com.aar.inAndOut;

public class Player {

	private String name;
	private int coins;
	private String chosenCard;
	private String chosenOrientation;
	
	public Player() {
	
	}

	public Player(String name, int coins, String chosenCard, String chosenOrientation) {
		this.name = name;
		this.coins = coins;
		this.chosenCard = chosenCard;
		this.chosenOrientation = chosenOrientation;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getCoins() {
		return coins;
	}

	protected void setCoins(int coins) {
		this.coins = coins;
	}

	protected String getChosenCard() {
		return chosenCard;
	}

	protected void setChosenCard(String chosenCard) {
		this.chosenCard = chosenCard;
	}

	protected String getChosenOrientation() {
		return chosenOrientation;
	}

	protected void setChosenOrientation(String chosenOrientation) {
		this.chosenOrientation = chosenOrientation;
	}
	
	public int betCoins(int coins) {
		if(coins > this.coins) {
			System.out.println("You cannot bet more than what you have");
		}
		this.coins -= coins;
		return coins;
	}
	
	public void addWinnings(int coins) {
		this.coins += coins;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", coins=" + coins + ", chosenCard=" + chosenCard + ", chosenOrientation="
				+ chosenOrientation + "]";
	}
}
