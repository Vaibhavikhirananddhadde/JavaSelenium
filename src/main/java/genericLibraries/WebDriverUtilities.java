package genericLibraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class WebDriverUtilities {
	//1.generic method for mouse over action
	public void mouseOvering(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	//2.generic method for right click
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	//3.generic method for double click
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//4.drag and drop
	public void dragDrop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	//5.dropdown
	public void dropDown(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(value);
	}
	//6.generic method for implicit wait
	public void implicitWaitMethod(WebDriver driver,int Time)
	{
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
	}
	//7.generic method to handle frame
	public void frame(WebDriver driver,WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	//8.generic method to switch back to normal web page
	public void back(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	//9.Aterpopup accept
	public void alterPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	//10.Alter Popup Dismiss
	public void alter(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	//11.child browser popup
	public void shiftingTabs(WebDriver driver)
	{
		Set<String> child=driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	//12.parent webPage
	public void parentbrowser(WebDriver driver)
	{
		driver.getWindowHandle();
	}
	//13.Scrollbar
	public void scrollBar(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	}

}
