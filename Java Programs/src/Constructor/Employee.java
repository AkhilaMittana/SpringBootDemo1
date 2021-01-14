package Constructor;
class Person
{
	String name="Akhila";	
}
class Employee extends Person{
	
	double salary=25000;
	int year=2020;
	String insurance_number="98745620";
	System.out.println(super.name);
	
    public static void main(String[] args) {
		Employee record=new Employee();
		
	}     

}
