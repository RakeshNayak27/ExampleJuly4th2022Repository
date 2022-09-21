package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug4HW2 {
	
	public static WebDriver oBrowser=null;
	public static ActiveTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		Createuser();
        Modifyuser();
        deleteuser();
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
	private static void Createuser()
	{
		try
		{
			oPage.getCreateuser().click();

			Thread.sleep(2000);
			oPage.getAdduser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("Rakesh");
			oPage.getlastname().sendKeys("Nayak");
			oPage.getemail().sendKeys("rakeshraku1997@gmail.com");
			oPage.getuserDataLightBox_usernameField().sendKeys("Rakesh");
			oPage.getuserDataLightBox_passwordField().sendKeys("rakeshraki");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("rakeshraki");
			oPage.getuserDataLightBox_commitBtn().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser()
	{
		try
		{
			oPage.getClickonwholeuser().click();
			oPage.getClickonusernameandclear().clear();
			oPage.getfirstname().sendKeys("Rakeshraku");
			oPage.getlastname().sendKeys("Nayak");
			oPage.getemail().sendKeys("");
			oPage.getuserDataLightBox_usernameField().sendKeys("Rakesh");
			oPage.getuserDataLightBox_passwordField().sendKeys("rakeshraki");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("rakeshraki");
			oPage.getuserDataLightBox_commitBtn().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oPage.getDeleteuser().click();
			Thread.sleep(4000);
			oPage.getuserDataLightBox_deleteBtn().click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
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
