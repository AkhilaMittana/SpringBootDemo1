package Strings;
abstract class Shape{
			abstract void draw();
			}
			class Rectangle extends Shape{
			void draw(){System.out.println("drawing rectangle");}
			}
			class Circle extends Shape{
			void draw(){System.out.println("drawing circle");}
			}
			class Test{
			public static void main(String args[]){
			Shape s=new Circle();
			//In real scenario, Object is provided through factory method
			s.draw();
			}
			
	}


