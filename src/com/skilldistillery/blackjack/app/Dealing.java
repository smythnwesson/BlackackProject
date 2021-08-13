package com.skilldistillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class Dealing {

	public static void main(String[] args) {
		Dealing dealing = new Dealing();
		dealing.run();
		
	}
		
	public void run() {
		Deck deck = new Deck();
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("How many cards do you want? ");
		int numCards = sc.nextInt();
		sc.nextLine();
		
		//Deal the number of cards requested to the user
		//Get numCards from the Deck
		//shove the dealt Cards into your hand
		List<Card> hand = new ArrayList<>();
		for(int numReq = 0; numReq < numCards; numReq++) {
			//get a Card from the Deck
			hand.add(deck.dealCard());
			
		}
		for (Card card : hand) {
			System.out.println(card);
			
		}
		} catch(Exception e) {
			System.err.println("Read the instructions: RTFM");
		}
		sc.close();
	}

}
