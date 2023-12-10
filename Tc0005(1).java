package sel;


import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNotNull;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class Tc0005 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chrome\\chromedriver-win64\\chromedriver.exe");
	
		
		
        
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(options);
		
		
		
		
        
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		 options.addArguments("--remote-allow-origins=*");
		
		
		 
		
		
		//1) open url on the browser
		
		driver.get("http://demo.perscholastraining.com//");
		driver.manage().window().maximize();
		
		//delay
		Thread.sleep(3000);
		
		//2)Click on My Account Button from header@Test
		
		//JavaScript Clicker code to click on a specific product
		WebElement myAccountButton = driver.findElement(By.xpath("//div[@class='product-loop-header product-item__header']//h2[@class='woocommerce-loop-product__title'][contains(text(),'Tablet Red EliteBook')]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", myAccountButton);
		
	WebElement priceElement = driver.findElement(By.xpath("//div[@class='single-product-wrapper row']//bdi[1]"));
					 		
					 		boolean priceText = priceElement.isDisplayed();

					        // Print the displayed price
					        System.out.println("Displayed Price: " + priceText);
					 		if (priceText)
					 		{
					            System.out.println("The price is $2,299. Display is true.");
					        } else {
					            System.out.println("The price is not $2,299. Display is false.");
					        }
		
		


		
	//	driver.findElement(By.xpath("//p[@id='comp-j6gqwjnf1label']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//p[@id='comp-j6gqwjnf1label']")).click();
		
		//3)Enter Username
		//driver.findElement(By.xpath()))).sendKeys("dummy");
		//4)Enter Email adress
		//driver.findElement(By.id("reg_email")).sendKeys("dummy@gmail.com");
		
		//5Enter Password
		//driver.findElement(By.id("reg_password")).sendKeys("123#$%67*&$%!!!!!");
		
		//Click Login
		//driver.findElement(By.name("register")).sendKeys(Keys.ENTER);
	//	driver.findElement(By.name("register")).click();
				
		
		
		

		

		    


	}

}
