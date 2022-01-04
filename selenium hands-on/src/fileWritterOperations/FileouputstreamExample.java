package fileWritterOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.asynchttpclient.request.body.generator.ByteArrayBodyGenerator;

public class FileouputstreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String Location="UsingFOS.txt";
			String Content="File output Stream";
			
		FileOutputStream fileouput=new FileOutputStream(Location);
		
	byte [ ]  WriteThis=	Content.getBytes();
		
		fileouput.write(WriteThis);
		fileouput.close();
		
		
	
		
	}

}
