package combunfly.adatee.object;

public class Adater  implements Target {
	private Adatee adatee;
	
	public Adater(Adatee adatee) {
		this.adatee = adatee;
	}
	
	@Override
	public void hadoop() {
		System.out.println("我会Hadoop!!");

	}


	@Override
	public void java() {
		this.adatee.java();
		
	}

}
