package com.Simplilearn.TestingMedicareWebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registrationpage {
	
	
	public void amttosinguppage() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8091/medicare/");
		Thread.sleep(2500);
		driver.findElement(By.id("signup")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("firstName")).sendKeys("mr");
		driver.findElement(By.id("lastName")).sendKeys("aviram");
		driver.findElement(By.id("email")).sendKeys("qwert32i123@example.com");
		driver.findElement(By.id("contactNumber")).sendKeys("8790653421");
		driver.findElement(By.id("password")).sendKeys("qwer321");
		driver.findElement(By.id("confirmPassword")).sendKeys("qwer321");
		
		driver.findElement(By.id("role1")).isSelected();
		
		driver.findElement(By.cssSelector("button[name='_eventId_billing']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#addressLineOne")).sendKeys("sector2");
		driver.findElement(By.name("addressLineTwo")).sendKeys("sector12");
		driver.findElement(By.id("city")).sendKeys("ecoter");
		driver.findElement(By.cssSelector("#postalCode")).sendKeys("43215");
		driver.findElement(By.id("state")).sendKeys("terwton");
		driver.findElement(By.id("country")).sendKeys("yut");
		driver.findElement(By.name("_eventId_confirm")).click();
		Thread.sleep(500);
		driver.findElement(By.partialLinkText("Confi")).click();
		driver.quit();
	}

}
