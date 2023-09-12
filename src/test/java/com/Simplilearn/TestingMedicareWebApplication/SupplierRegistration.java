package com.Simplilearn.TestingMedicareWebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SupplierRegistration {
	
	
	public void  amttosinguppage() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8091/medicare/");
		Thread.sleep(2500);
		driver.findElement(By.id("signup")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("firstName")).sendKeys("Bikash");
		driver.findElement(By.id("lastName")).sendKeys("singh");
		driver.findElement(By.id("email")).sendKeys("bikash342@example.com");
		driver.findElement(By.id("password")).sendKeys("tomcat");
		driver.findElement(By.id("confirmpassword")).sendKeys("tomcat");
		driver.findElement(By.id("role2")).isSelected();
		driver.findElement(By.tagName("buttom")).click();
		Thread.sleep(500);
		driver.findElement(By.id("addressLineOne")).sendKeys("sector 22");
		driver.findElement(By.id("addressLinetwo")).sendKeys("sector 16");
		driver.findElement(By.id("city")).sendKeys("ecoter");
		driver.findElement(By.id("postalcode")).sendKeys("43215");
		driver.findElement(By.id("state")).sendKeys("terwton");
		driver.findElement(By.id("country")).sendKeys("yut");
		driver.findElement(By.name("_eventId_confirm")).click();
		Thread.sleep(500);
		driver.findElement(By.partialLinkText("Confi")).click();
		driver.quit();
	}

}
