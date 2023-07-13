package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Checked {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream("C:\\ofss\\file1.txt");
		int k;
		
		while ((k = fs.read()) != -1) {
			
			System.out.println((char)k);
		}
	}

}
