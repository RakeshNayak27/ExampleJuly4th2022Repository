package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutChromeDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		Launchbrowser();
		Navigate();
		Login();
		minimizeFlyOutWindow();
		Logout();
		CloseBrowser();


	}
	private static void Launchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try {
			oBrowser.get("http://localhost:62578/login.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			//By by=By.id("username");
			//WebElement ele=oBrowser.findElement(by);
			//ele.sendKeys("admin");

			//OR

			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();

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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{

			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			//oBrowser.findElement(By.linkText("Logout")).click();
			//oBrowser.findElement(By.id("logoutLink")).click();
			oBrowser.findElement(By.className("logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CloseBrowser()
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
