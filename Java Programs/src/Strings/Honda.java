package Strings;
abstract class Bike
	{
	int limit=30;
	Honda()
	{
		System.out.println("constructor is invoked");}
	void getDetails(){System.out.println("it has two wheels");}
	abstract void run();
	}
	class Honda extends Bike{
	void run(){System.out.println("running safely..");}
	public static void main(String args[]){
	Honda obj = new Honda();
	obj.getDetails();
	
	}
	}


