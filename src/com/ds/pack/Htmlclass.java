package com.ds.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Htmlclass {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\AutomationSoftwares\\New folder\\latestChromeDriver\\chromedriver.exe");
        WebDriver driver = new HtmlUnitDriver();
       // WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/v4/index.php");
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
       driver.findElement(By.name("uid")).sendKeys("mngr235250");
       Thread.sleep(5000);
       
      driver.findElement(By.name("password")).sendKeys("qaheqed");
      Thread.sleep(5000);
      driver.findElement(By.name("btnLogin")).click();
      
      System.out.println("Login Success");
               
	}

}
