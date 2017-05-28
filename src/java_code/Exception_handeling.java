package java_code;

import java.io.IOException;

public class Exception_handeling {
	public static void main(String[] args) {
		//simple try catch block
		int num_1 = 0;
		double num_2=0;
		double num_3;
		try {
			num_3 = num_2/num_1;// exception
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			// will execute at the last 
		}
	
	}
	void openFile(String filename)throws IOException {// here i need not to implement logic for exception handling
		System.out.println("filename");				  // it's going to be handle by those who going to call that function
	}
}
