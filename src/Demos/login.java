package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login {
WebDriver driver=new FirefoxDriver();
	
	@Test(priority=1)
	public void Browser() throws InterruptedException
	{
		System.out.println("Welcome");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void Credentials() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("jo.kothuri@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("girija");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).submit();
	}
	
	@Test(priority=3)
	public void Logout() throws InterruptedException
	{
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("uiLinkButtonInput")).click();
	}
}
