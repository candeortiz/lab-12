package lab12;

public class Test {

	public static void main(String[] args) {

		Roshambo r = Roshambo.valueOf("PAPER");
		System.out.println(r.toString());
		System.out.println(Roshambo.values()[2]);
	}

}
