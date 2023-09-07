package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowser 
{
	public static void main(String[] args) 
	{
		//WebDriver driver=new ChromeDriver();
		String Key="webdriver.chrome.driver";
		String value="./chromedriver.exe";
		System.setProperty(Key, value);
		WebDriver driver=new ChromeDriver();
	}
	

}
