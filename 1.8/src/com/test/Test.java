package com.test;

import combunfly.adatee.object.Adatee;
import combunfly.adatee.object.Adater;
import combunfly.adatee.object.Target;

/*import combunfly.adatee.Adater;
import combunfly.adatee.Target;
*/
/**
 * 测试类
 * 适配器模式： 当源不足满足目标的需求时，
 * 为了满足目标的需求但是又不想改变原的功能，
 * 这是我们使用一个适配器来达成目标要求。
 * 
 * 两种类型：1） 类适配
 * 好处：1.在不改变圆的代码的情况下匹配目标的需求
 * 	   2.通过继承源的方式获得他的功能，达成了合成复用的原则，提高了代码的复用率
 * 局限性：1.适配器继承了类，这是他就没办法在获得同级子类
 * 		2.引入了第三方的类，增加了系统的复杂性，通过类适配不够灵活，一个适配器只能适配一个源的目标
 *  2）通过对象适配使得适配更加灵活
 *  
 * 
 */
public class Test {

	public static void main(String[] args) {
		Target tar = new Adater(new Adatee());
		tar.java();
		tar.hadoop();

	}
	
	/*public static void main(String[] args) {
		Target tar = new Adater();
		tar.java();
		tar.hadoop();
		
	}*/

}
