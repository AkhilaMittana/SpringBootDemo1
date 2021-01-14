package Strings;

public class Ex3 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Miracle");
		s1.append(" Software");
		s1.insert(16," Systems");
	   System.out.println(s1);
	   s1.replace(0,7,"Java");
	   System.out.println(s1);
	   s1.delete(0,4);
	   System.out.println(s1);
	   s1.reverse();
	   StringBuffer s2=new StringBuffer();
	   System.out.println(s2.capacity());
	   System.out.println(s2.ensureCapacity(1));
	   s2.append("Hello");
	   System.out.println(s2);
	   System.out.println(s2.capacity());


	   
				

	}

}
