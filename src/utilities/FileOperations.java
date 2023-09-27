package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileOperations 
{
	public String Method_ReadPropertyFile(String key) throws Exception 
	{
		File file=new File(".\\src\\config.properties");
		FileInputStream fs=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fs);
		String keyValue= prop.getProperty(key);
		return keyValue;
	}

}
