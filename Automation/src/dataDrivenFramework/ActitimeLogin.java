package dataDrivenFramework;

import java.io.IOException;

public class ActitimeLogin {

	public static void main(String[] args) throws IOException {
		
		GetData data = new GetData();
		String url = data.getdatafrompropertyfile("./testData/CommonData.properties", "url");
		System.out.println(url);
		
	}
}
