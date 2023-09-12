package com.Simplilearn.TestingMedicareWebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {
	
	public void add() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8091/medicare/");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("username")).sendKeys("avi123@example.com");
		driver.findElement(By.id("password")).sendKeys("qwer321");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href='/medicare/show/all/products']")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.tagName("input")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Continue Shopping")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@class='btn btn-success'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Checko")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Select")).click();
		Thread.sleep(500);
		driver.findElement(By.id("cardNumber")).sendKeys("564321567");
		driver.findElement(By.id("expityMonth")).sendKeys("44");
		driver.findElement(By.id("expityYear")).sendKeys("1997");
		driver.findElement(By.id("cvCode")).sendKeys("567");
		driver.findElement(By.linkText("Pay")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("h3[class ='text-center']")).getText());
		driver.quit();
}
}