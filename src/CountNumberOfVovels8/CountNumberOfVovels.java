package CountNumberOfVovels8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountNumberOfVovels {

	public static void main(String[] args) {
	File file = new File("F:/ACADGILD-FILE-HANDLING/numberofvovels.txt");
	
	
	try {
		FileWriter fw = new FileWriter(file);
		fw.write("Count number of vovels in the text file");
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		FileReader fr = new FileReader(file);
		char data[] = new char[1024];				    
	    fr.read(data);
	    String st=new String(data);
		
	    int count = 0;
	    for (int i = 0; i < st.length(); i++) {
	    char ch = st.charAt(i);
	    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                count++;
	            }
	        }
	        System.out.println("Number of vowels : " + count);
	        fr.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
