package Strings;
public class Ex1 {

	public static void main(String[] args) {
		String s1="Miracle";
		String s2=new String("Miracle");
		String s3="Miracle";
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3==s1);
		System.out.println(s3==s2);


	}

}
