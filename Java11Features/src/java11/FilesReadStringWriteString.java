package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
/**
 * 
 * @author rishiraj
 * to read from and write to file
 */
public class FilesReadStringWriteString {
	public static void main(String[] args) {

		// Absolute path format for Windows: "D:\\tmp\\finalvariables.txt"
		var filePath = "httpClientLogs.txt";
		try {
			//JDK 11
			String fileData = Files.readString(Path.of(filePath));
			System.out.println(fileData);
			
			//JDK 11
			Files.writeString(Path.of(filePath),"new string added", StandardOpenOption.APPEND);
			fileData = Files.readString(Path.of(filePath));
			System.out.println(fileData);
			
		}catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
}
