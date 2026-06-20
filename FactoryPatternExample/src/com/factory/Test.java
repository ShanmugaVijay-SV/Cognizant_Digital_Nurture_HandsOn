package com.factory;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of Document : ");
		String string = sc.nextLine();
		
		DocumentFactory df = new DocumentFactory();
		Document doc =df.getObject(string);
		
		System.out.println(doc.createDocument());
		
		sc.close();
	}

}
