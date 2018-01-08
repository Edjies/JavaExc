package com.phb.exc;
/***
 * 笔记：关于继承应该注意以下几点：
 * 1.和传统的理解不同，子类并不是父类的一个子集。实际上一个子类通常比他的父类包含更多的信息和方法。
 * 2.父类中的私有数据域在该类之外是不能访问的，因此，不能在子类中直接使用。但是如果父类中定义了公共
 * 的访问器修改器，那么可以通过这些公共的访问器和修改器来访问和修改他们。
 * 3.不是所有的is-a关系都该用继承来建模。例如，正方形是一种矩形，但是不应该定义一个Square类来扩展
 * Rectangle类，因为width和height属性并不适合于正方形。应该定义一个继承自GeometricObject类
 * 的Square类，并为正方形的边定义一个side属性。
 * 4.继承是用来为is-a关系建模的。不要仅仅为了重用方法这个原因而盲目的扩展一个类，例如；尽管Person类
 * 和Tree类可以共享类似高度和重量这样的通用特性，但是从Person类扩展出Tree类是毫无意义的。一个父类
 * 和他的子类之间必须存在is-a关系。
 * 5.某些程序设计语言是允许从几个类派生出一个子类的，这种能力称为多重继承。但是再java中是不允许多重
 * 继承的。一个java类只可能直接继承自一个父类。这种限制称为单一继承。如果使用extends关键字类定义一
 * 个子类，他只允许有一个父类。然而，多重继承是可以通过接口来实现的。
 * @author dell
 *
 */

public class TestCircleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleFromSimpleGeometricObject circle=new CircleFromSimpleGeometricObject(1);
		System.out.println("A circle"+circle.toString());
		System.out.println("The color is "+circle.getColor());
		System.out.println("The radius is "+circle.getRadius());
		System.out.println("The area is "+circle.getArea());
		System.out.println("The diameter is "+circle.getDiameter());
		
		RectangleFromSimpleGeometricObject rectangle=new RectangleFromSimpleGeometricObject(2,4);
		System.out.println("\n A rectangle "+rectangle.toString());
		System.out.println("The area is "+rectangle.getArea());
		System.out.println("The perimeter is "+rectangle.getPerimeter());
		
	}

}
