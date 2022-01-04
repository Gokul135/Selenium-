package fileWritterOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	String Location="UsingFileWritter";
	String Content="Make it simple";
	
	FileWriter filewriter=new FileWriter(Location);
	filewriter.write(Content);
	filewriter.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
