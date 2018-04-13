package combunfly.proxy;
/**
 * 代理模式：为了减轻真是主题的业务负担，我们引入代理对象，通过代理获得真实主题的方法，并且不改变真实主题的原意，
 *        但是可以在代理对象中添加自己的方法；真实主题可以对外隐藏不对外的方法。
 *       
 *   好处：通过代理对象减轻了真实对象的负担，使得真实主题所要完成的事情更加具有针对性。
 *   坏处： 引入代理对象使得我们在调用主题方法时调用的实际是代理对象的方法，增加了系统的的复杂    
 *		性，容易产生混淆。
 */
public class Test {

	public static void main(String[] args) {
		
		/*Proxy p = new Proxy(new realSubject());
		System.out.println("买了"+p.selltick()+"张票！");
		p.method();*/
		
		realSubject real = new realSubject();
		System.out.println("买了"+real.selltick()+"张票！");
		real.exitTick();
		real.changeTick();

	}

}
