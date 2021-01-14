package Constructor;


	class Bike{
		int speed=50;
		Bike()
		{
			System.out.println("Bike constructor");
		}
		}
		class Vehicle extends Bike{
		int speed=100;
		Vehicle()
		{
			System.out.println("Vehicle constructor");
		}
		void display(){
		System.out.println(super.speed);
		System.out.println(speed);
		}
		public static void main(String args[]){
		 Vehicle b=new Vehicle();
		b.display();-
		}
		}

	
