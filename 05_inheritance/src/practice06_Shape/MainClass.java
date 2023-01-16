package practice06_Shape;

public class MainClass {

	public static void main(String[] args) {

		Shape circle = new Circle(1.5);
		
		System.out.println(circle.getArea());
		
		Shape rectangle = new Rectangle(1.5, 2.5); // 너비 1.5 높이 2.5인 사각형	
		System.out.println(rectangle.getArea());
		
		Shape square = new Square (1.5); // 변 1.5 정사각형
		System.out.println(square.getArea());
		
	}

}
