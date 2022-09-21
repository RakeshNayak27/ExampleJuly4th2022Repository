package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug4HW4 {
	public static WebDriver oBrowser=null;
	public static ActiveTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Createcustomer();
		Modifycustomer();
		Deletecustomer();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiveTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:62578/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oPage.getusername().sendKeys("admin");
			oPage.getpassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Createcustomer()
	{
		try
		{
			oPage.getCreatecustomer().click();
			oPage.getAddnew().click();
			Thread.sleep(2000);
			oPage.getClicknewcustomer().click();
			Thread.sleep(2000);
			oPage.getEnterCustomername().sendKeys("Rakesh");
			oPage.getClickcreatecustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Modifycustomer()
	{
		try
		{
			oPage.getClicksettingsbutton().click();
			Thread.sleep(2000);
			oPage.getClickactivebutton().click();
			Thread.sleep(2000);
			oPage.getClickarchievebutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Deletecustomer()
	{
		try
		{
			oPage.getClickSettingtodelete().click();
			Thread.sleep(2000);
			oPage.getClickactiontodelete().click();
			Thread.sleep(4000);
			oPage.getClickdeleteafteraction().click();
			Thread.sleep(2000);
			oPage.getClickpermanentlydelete().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}





