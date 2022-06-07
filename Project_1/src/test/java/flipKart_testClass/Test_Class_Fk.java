package flipKart_testClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import poM_Class_Flipkart.Home_Flipkart;
import poM_Class_Flipkart.LogOut_FlipKart;
import poM_Class_Flipkart.Login_FlipKart;



public class Test_Class_Fk {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver61.exe");
		
		   WebDriver driver=new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
			
			driver.get("https://www.flipkart.com/");
			//LOGIN
			Login_FlipKart logintoflipkart=new Login_FlipKart(driver);
			Thread.sleep(2000);
			
			logintoflipkart.sendEmailId();
			logintoflipkart.sendPassword();
			Thread.sleep(2000);
			logintoflipkart.loginClick();
			
			//LOGOUT
			LogOut_FlipKart logoutflipkart = new LogOut_FlipKart(driver);
			Home_Flipkart homeflipkartvaibhav=new Home_Flipkart(driver);
			//TakeScreenShot screenshot= new TakeScreenShot(driver);

			//test1
			
			
			Thread.sleep(2000);
			homeflipkartvaibhav.movetoVaibhav(driver);
			//Thread.sleep(2000);
			homeflipkartvaibhav.clickOnMyProfile();
			//Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			String title= driver.getTitle();
			Thread.sleep(2000);	
			System.out.println(url);
			Thread.sleep(2000);	
			System.out.println(title);
			Thread.sleep(2000);
			if((url.equals("https://www.flipkart.com/account/?rd=0&link=home_account") && title.equals("My Profile")))
			{
		    System.out.println("Pass");
			}
			else
	        {
		    System.out.println("Fail");
	        }	
	        Thread.sleep(3000);	
			logoutflipkart.movetOMyName(driver);
			Thread.sleep(2000);
			logoutflipkart.clikonLOgOut();
			
			
		
			//test2
			Thread.sleep(3000);
			logintoflipkart.sendEmailId();
			logintoflipkart.sendPassword();
			Thread.sleep(2000);
			logintoflipkart.loginClick();
			//Home_Flipkart_Vaibhav homeflipkartvaibhav=new Home_Flipkart_Vaibhav(driver);
			
			Thread.sleep(3000);
			homeflipkartvaibhav.movetoVaibhav(driver);
			Thread.sleep(2000);
			homeflipkartvaibhav.clickOnPlus();
			Thread.sleep(2000);
			 url = driver.getCurrentUrl();
			 title= driver.getTitle();
			 Thread.sleep(2000);	
			System.out.println(url);
			Thread.sleep(2000);	
			System.out.println(title);
			Thread.sleep(2000);
			if((url.equals("https://www.flipkart.com/plus") && title.equals("Flipkart Plus – The Ultimate Rewards Program for Flipkart Customers | Flipkart.com")))
			{
		    System.out.println("Pass");
			}
			else
	        {
		    System.out.println("Fail");
	        }
			
			Thread.sleep(4000);	
			logoutflipkart.movetOMyName(driver);
			Thread.sleep(3000);
			logoutflipkart.clikonLOgOut();
			
			//test 3
			logintoflipkart.sendEmailId();
			logintoflipkart.sendPassword();
			Thread.sleep(2000);
			logintoflipkart.loginClick();
			
			Thread.sleep(3000);
			homeflipkartvaibhav.movetoVaibhav(driver);
			Thread.sleep(2000);
			homeflipkartvaibhav.clickOnorders();
			Thread.sleep(2000);
			 url = driver.getCurrentUrl();
			 title= driver.getTitle();
			 Thread.sleep(2000);	
			System.out.println(url);
			Thread.sleep(2000);	
			System.out.println(title);
			Thread.sleep(2000);
			if((url.equals("https://www.flipkart.com/account/orders?link=home_orders") && title.equals("Flipkart.com: Your Order History")))
			{
		    System.out.println("Pass");
			}
			else
	        {
		    System.out.println("Fail");
	        }
			Thread.sleep(4000);	
			logoutflipkart.movetOMyName(driver);
			Thread.sleep(4000);
			logoutflipkart.clikonLOgOut();
			
			//test 4
			
			logintoflipkart.sendEmailId();
			logintoflipkart.sendPassword();
			Thread.sleep(2000);
			logintoflipkart.loginClick();
			Thread.sleep(3000);
			
			homeflipkartvaibhav.movetoVaibhav(driver);
			Thread.sleep(2000);
			homeflipkartvaibhav.clickOnwishlist();
			Thread.sleep(2000);
			 url = driver.getCurrentUrl();
			 title= driver.getTitle();
			 Thread.sleep(2000);	
			System.out.println(url);
			Thread.sleep(2000);	
			System.out.println(title);
			Thread.sleep(2000);
			if((url.equals("https://www.flipkart.com/wishlist?link=home_wishlist") && title.equals("My Wishlist")))
			{
		    System.out.println("Pass");
			}
			else
	        {
		    System.out.println("Fail");
	        }
			Thread.sleep(5000);	
			logoutflipkart.movetOMyName(driver);
			Thread.sleep(6000);
			logoutflipkart.clikonLOgOut();
			
			
			//test 5
			
			logintoflipkart.sendEmailId();
			logintoflipkart.sendPassword();
			Thread.sleep(2000);
			logintoflipkart.loginClick();
			
			Thread.sleep(3000);
			homeflipkartvaibhav.movetoVaibhav(driver);
			Thread.sleep(2000);
			homeflipkartvaibhav.clickOnMychats();
			Thread.sleep(2000);
			url = driver.getCurrentUrl();
			title= driver.getTitle();
			 Thread.sleep(2000);	
			System.out.println(url);
			Thread.sleep(2000);	
			System.out.println(title);
			Thread.sleep(2000);
			if((url.equals("https://www.flipkart.com/my-chats?link=home_chat") && title.equals("My Chats")))
			{
		    System.out.println("Pass");
			}
			else
	        {
		    System.out.println("Fail");
	        }
			Thread.sleep(5000);	
			logoutflipkart.movetOMyName(driver);
			Thread.sleep(6000);
			logoutflipkart.clikonLOgOut();
			
			//test3-> check searched products and pop up window handling
			
//			BuyMobile buymobile= new BuyMobile(driver);
//			buymobile.searchAnything();
//			buymobile.clickOn1stiTem();
//			buymobile.clickOnBuynow(driver);
//			
//			buymobile.clickonaddress();
//			screenshot.takeScreenshot(driver);
//			buymobile.mainpage(driver);
//			driver.navigate().refresh();
//			
			
			
			
	}
	




}
