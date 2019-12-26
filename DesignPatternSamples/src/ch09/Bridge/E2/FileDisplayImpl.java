package ch09.Bridge.E2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileDisplayImpl extends DisplayImpl {
	String filePath;
	String fileString;
	
	public FileDisplayImpl(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void rawOpen() {
		StringBuilder builder = new StringBuilder();
		 try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8)) 
		    {
		        stream.forEach(s -> builder.append(s).append("\n"));
		    }catch (IOException e){
		    	e.printStackTrace();
		    }
		fileString = builder.toString();
	}

	@Override
	public void rawPrint() {
		System.out.println(fileString);
	}

	@Override
	public void rawClose() {
		
	}
	
}
