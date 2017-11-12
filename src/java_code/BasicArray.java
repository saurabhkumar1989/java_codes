package java_code;

import java.util.ArrayList;
public class BasicArray {
	public static void main(String [] args) {
		double [] rainfall = new double[365];// array of size 365
		// array is fixed size - for dynamic type use list
		ArrayList<String> names = new ArrayList<String>();
		// list of sting type :)
		names.add("firt element");
		names.add("second element");
		for (String item : names) {// data type list return variable : list
			System.out.println(item);
		}
		System.out.println(names.size());
	}
}
