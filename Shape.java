
abstract class Shape {
	 int n1=4;
	 int n2=6;
	 abstract void printArea();
	 public static void main(String[]args) {
		 Shape s1=new Rectangle();
		 s1.printArea();
		 Shape s2=new Triangle();
		 s2.printArea();
		 Shape s3=new Circle();
		 s3.printArea();
	 }

}
 class Rectangle extends Shape{
	public void printArea() {
		System.out.println("Rectangle area is "+n1*n2);
	}
}
 class Triangle extends Shape{
		public void printArea() {
			System.out.println("triangle area is"+(n1*n2)/2);
		}
	}
 class Circle extends Shape{
		public void printArea() {
			System.out.println("circle area is "+(Math.PI*n1*n1));
		}
	}
 
