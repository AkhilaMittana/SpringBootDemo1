package Strings;

public class Ex2 {

	public static void main(String[] args) {
	 String s="Sachin";
	 String s2="sachin";
	 String s1=s.concat(" Tendulkar");
	 System.out.println(s.equals(s1));
	 System.out.println(s.equals(s2));
	 System.out.println(s.equalsIgnoreCase(s2));
	 System.out.println(s==s2);
	 String str1 = "Strings are immutable";
	 String str2 = "Strings are immutable";
	 String str3 = "Integers are not immutable";
	 int result = str1.compareToIgnoreCase( str2 );
	 System.out.println(result);
	 result = str2.compareToIgnoreCase( str3 );
	 System.out.println(result);
	 result = str3.compareToIgnoreCase( str1 );
	 System.out.println(result);
     System.out.println(s1.substring(2,10));
     System.out.println(str1.trim());
     System.out.println(str1.startsWith("St"));
     System.out.println(str3.endsWith("ble"));
     System.out.println(str1.charAt(10));
     System.out.println(str1.length());
     System.out.println(str1.indexOf('p'));
     System.out.println(str1.indexOf('s'));
     System.out.println(str1.indexOf('z'));
     System.out.println(str1.valueOf(123));
     System.out.println(str1);
     String s5=str1.replaceAll(str2, str3);
     /*System.out.println(s5);
     System.out.println(str1);
     System.out.println(str2);*/
     System.out.println(str3);
   
     

    /* String s3="Akhila";
     String s4="Akhila123";
     System.out.println(s3.compareTo(s4));*/
    		 
	}

}
