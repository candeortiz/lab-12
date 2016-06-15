package lab12;

public enum Roshambo {
	// is like a class
	ROCK, PAPER, SCISSORS;

	// enum has name method
	// also valueOf and Values methods
	// when I use the methods toString I get back the items of the list, only
	// the current one not all 3.

	public String toString() {
		return "Roshambo: " + this.name();
	};

}
