package combunfly.proxy;

public class realSubject implements Subject {

	@Override
	public int selltick() {
		System.out.println("开始卖票！");
		return 1;
		
	}
	
	public void changeTick() {
		System.out.println("改签火车票！！");
	}
	
	public void exitTick() {
		System.out.println("退火车票！！");
	}

}
