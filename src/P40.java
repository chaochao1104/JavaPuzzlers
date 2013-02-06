public class P40 {

	private P40 internalInstance = new P40();

	public P40() throws Exception {
		throw new Exception("I'm not coming out");
	}

	public static void main(String[] args) {
		try {
			P40 b = new P40();
			System.out.println("Surprise!");
		} catch (Exception ex) {
			System.out.println("I told you so");
		}

	}

}
