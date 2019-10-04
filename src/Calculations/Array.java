package Calculations;

import java.util.LinkedList;

import org.testng.annotations.Test;

public class Array {
    @Test
	public  void listArray() {

		LinkedList<String> names = new LinkedList<>();
		names.add(0, "John");
		names.add(1, "Peter");
		names.add(2, "Dolly");
		names.add(3, "Alex");
		System.out.println("Print names:" + names);

	}

}
