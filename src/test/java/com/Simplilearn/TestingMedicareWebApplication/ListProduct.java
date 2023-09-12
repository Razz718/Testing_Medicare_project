package com.Simplilearn.TestingMedicareWebApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListProduct {
	
	
	public void product() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8091/medicare/");
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("a[href='/medicare/show/all/products']")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2500);
		Select obj = new Select(driver.findElement(By.tagName("select")));
		obj.selectByValue("-1");
		WebElement table = driver.findElement(By.id("productListTable"));
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));
		for (WebElement row : rows) {
			List<WebElement>cells = row.findElements(By.xpath(".//td"));
			for (WebElement cell : cells) {
				System.out.println(cell.getText());
			}
			
		}
		 driver.quit();
	}

}
