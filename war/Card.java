package war;

public class Card {

	private int value;
	private String name;
	
	public Card(int value, String suit) {
		this.value = value;
	switch(value) {	
		case 2: name = "Two";
		break;
		case 3: name = "Three";
		break;
		case 4: name = "Four";
		break;
		case 5: name = "Five";
		break;
		case 6: name = "Six";
		break;
		case 7: name = "Seven";
		break;
		case 8: name = "Eight";
		break;
		case 9: name = "Nine";
		break;
		case 10: name = "Ten";
		break;
		case 11: name = "Jack";
		break;
		case 12: name = "Queen";
		break;
		case 13: name = "King";
		break;
		case 14: name = "Ace";
		break;
	}
	name += " of " + suit;
	}
	public void describe() {
        System.out.println(name + ". Value of " + value);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

