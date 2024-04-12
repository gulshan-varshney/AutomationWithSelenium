package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetData {

	public String getdatafrompropertyfile(String filePath, String key) throws IOException {
		
		FileInputStream fis= new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		}
}
