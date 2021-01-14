package Constructor;
class A
{
	int x=10;
void display()
{
	System.out.println("x value of A "+x);
	}
}
class B extends A
{
 int x=11;
 void display()
 {
	 System.out.println("X value of B class "+x);
 }
}

 class C extends A{
	 int x=12;
	 void display()
	 {
		 System.out.println("X value of class c"+x);
     }
 }
class  Exp1{
	public static void main(String[] args) {
		A obj= new C();
		A obj2= new B();
		B obj3=new B();
        obj2.display();
        obj.display();
        System.out.println(obj2.x);
        System.out.println(obj3.x);
        

	}
}
