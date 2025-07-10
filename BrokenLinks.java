package JavaBasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
	int count=	links.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		WebElement index=links.get(i);
	String url=	index.getDomAttribute("href");
	System.out.println(url);
	verifylink(url);
	}
	
		

	}

	 static void verifylink(String url) throws IOException {
		// TODO Auto-generated method stub
		 try {
		URL L1=new URL(url);
		HttpURLConnection connection = (HttpURLConnection) L1.openConnection();
		if(connection.getResponseCode()==200)
		{
			System.out.println("link is valid"+"  "+connection.getResponseCode()+"  "+connection .getResponseMessage());
		}
		else
		{
			System.out.println("invalid link"+ " "+ connection.getResponseCode()+" "+connection .getResponseMessage());

		}
		 }
		 catch(MalformedURLException m1){
			 System.out.println("handled the exception");
			 
		 }
			 
		 
		
	}

}
