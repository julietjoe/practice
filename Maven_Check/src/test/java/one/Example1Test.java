package one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1Test 
{
	WebDriver driver = null;
	
	@Test
	public void one()
	{
		System.out.println("hai hello");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
