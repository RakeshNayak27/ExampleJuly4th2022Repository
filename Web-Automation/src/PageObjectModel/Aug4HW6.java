package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug4HW6 {

	public static WebDriver oBrowser=null;
	public static ActiveTimePage oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Createcustomer();
		Createproject();
		Modifyproject();
		Deleteproject();
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

	private static void Createproject()
	{
		try
		{
			oPage.getClickaddnewbutton().click();
			oPage.getClicknewprojectbutton().click();
			Thread.sleep(2000);
			oPage.getClickprojectname().sendKeys("Rakeshnayak");
			Thread.sleep(2000);
			//oPage.getClickcustomername().sendKeys("Rakesh");
			oPage.getClickcreateproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Modifyproject()
	{
		try
		{
			oPage.getClickmodifyprojectsettings().click();
			Thread.sleep(2000);
			oPage.getClickmodifyactivebutton().click();
			Thread.sleep(2000);
			oPage.getClickmodifyarchievebutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void Deleteproject()
	{
		try
		{
			oPage.getClickdeleteprojectsettings().click();
			Thread.sleep(2000);
			oPage.getClickactiontodeleteproject().click();
			Thread.sleep(2000);
			oPage.getClickdeleteinactionbutton().click();
			Thread.sleep(2000);
			oPage.getClickpermanentlydeletebutton().click();
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

