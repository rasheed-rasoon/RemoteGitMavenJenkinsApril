package interfacesSample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class seleniumMethodsPracticeTest {
	 WebDriver driver;
  @Test
  public void f(WebElement element) {
	  
	 WebDriverWait wait =new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.visibilityOf(element));
	 driver.findElement( By.className(""));
	 
	 driver.navigate().back();
	 driver.navigate().forward();
	 
	 driver.manage().deleteAllCookies();
  }
  
  
  public void dragAndDrop(WebElement target,WebElement dest)
  {
	  Actions a=new Actions(driver);
		 a.dragAndDrop(target, dest).build().perform();
	  
  }
  
  
  public  void  alertHandling()
  {
	  Alert a=driver.switchTo().alert();
	  
	a.accept();
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript(script, args)
	 
  }
		
	public void StringToInteger()
	{
		
		String str="1,25.019";
		double d=Double.valueOf(str);
		
		double d2=Double.parseDouble(str);
		
		Integer i1=Integer.parseInt(str);
		
	}
  
}
