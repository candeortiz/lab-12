package lab12;

public class Validator {

	public boolean isValidName(String name) {
		// to check
		return !name.isEmpty();
	}

	// to control opponents
	// true or false --> to use it at loop
	public boolean isValidOpponent(String choicePlayer) {
		// only 2 or 1 allowed
		return choicePlayer.equalsIgnoreCase("1")
				|| choicePlayer.equalsIgnoreCase("2");

	}

	public boolean isValidRoshambo(String choiceRoshambo) {
		// check if string is ok
		// http://stackoverflow.com/questions/4936819/java-check-if-enum-contains-a-given-string

		// Roshambo.values is in java offering me the option
		for (Roshambo roshambo : Roshambo.values()) {
			if (roshambo.name().equalsIgnoreCase(choiceRoshambo)) {
				return true;
			}
		}
	}

}
