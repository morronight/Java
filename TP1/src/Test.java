
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Message M = new Message("COUCOU", "SALUT CA VA?", 1) ;
		Personne P = new Personne("reveillard", "th�o", M);
		System.out.println(P.toString());
	}

}
