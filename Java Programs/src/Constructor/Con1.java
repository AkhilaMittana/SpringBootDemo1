package Constructor;
class Employee
{
	static int salary=25000;
}
class Con1 extends Employee
{ 
     static int bonus=10000;
	public static void main(String[] args) {
		Con1 obj =new Con1();
		System.out.println("Employee salary "+salary);
		System.out.println("Bonus "+bonus);

	}

}
