import java.util.*;

public class lab7_1{
	public static void main(String arc[])
	{
		String str1="Hello",str2="java";

		System.out.println("length of string:"+str1.length());
		System.out.println("Charat:"+str1.charAt(2));
		System.out.println("concate:"+str1.concat(str2));
		System.out.println("indexof:"+str1.indexOf('e'));
		System.out.println("equls:"+str1.equals(str2));
		
		System.out.println("valueof:"+String.vauleOf(20));
		System.out.println("Tostring:"+str1.toString());
		System.out.println("trim"+str1.trim());
		System.out.println("substring"+str1.substring(1,3));
	}
}
