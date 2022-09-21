package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		closeapplication();

	}

	private static void launchbrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser = new ChromeDriver();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			oBrowser.get("http://localhost:62578/login.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeapplication() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}