package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Two {
    
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		String url = "https://demo.opencart.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys("mobiles");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3500)","");
        Thread.sleep(3000);
        WebElement returns = driver.findElement(By.linkText("Returns"));
        returns.click();
        driver.navigate().back();
        Thread.sleep(3000);
		  WebElement gift=driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a"));
		  gift.click();
		  driver.navigate().back();
		  
        driver.quit();

	}
}
