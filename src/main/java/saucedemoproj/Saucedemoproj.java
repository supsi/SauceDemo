package saucedemoproj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Saucedemoproj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C://Users//supra//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("secret_sauce");
		String s= pass.getAttribute("value");
		System.out.println(s);
		
		if(s.equals("secret_sauce"))
		{
			driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		}
		else
		{
			System.out.println("Incorrect password");
			driver.close();
		}
		
		WebElement we= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(we));
		
		we.click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Suprava");
		
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Sinha");
		
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("124567");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
		//driver.close();
		
		
		
		
		
		
		
		
		

	}

}
