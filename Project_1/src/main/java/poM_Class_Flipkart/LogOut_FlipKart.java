package poM_Class_Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_FlipKart {
	

	@FindBy(xpath="//div[text()='Vaibhav']")
	private WebElement movetovaibs;
	
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement logout;

	WebDriver driver;
	public LogOut_FlipKart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public  void movetOMyName(WebDriver driver) throws InterruptedException
	{
		
		Actions act= new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(movetovaibs).perform();
		
		
		
		//
		
	}
		public void clikonLOgOut() throws InterruptedException
	    {
		Thread.sleep(4000);
		logout.click();
		}

}
