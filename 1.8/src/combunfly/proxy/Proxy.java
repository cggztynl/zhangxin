package combunfly.proxy;

public class Proxy implements Subject{
	private Subject subject;
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public int selltick() {
		int num = this.subject.selltick();
		return num;
	}
	
	public void method() {
		System.out.println("卖老冰棍！！");
	}

}
