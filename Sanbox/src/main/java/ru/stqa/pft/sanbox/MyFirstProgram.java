package ru.stqa.pft.sanbox;

public class MyFirstProgram {

	public static void main (String[] args){
		hello("world");
		hello("user");
		hello("Almat");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Circle o = new Circle(5);
		System.out.println("Площадь круга с радиусом " + o.r + " = " + o.area());
	}

	public static void hello(String somebody) {
		System.out.println("hello, " + somebody + "!");

	}


}