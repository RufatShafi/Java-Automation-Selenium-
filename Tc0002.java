package sel;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Tc0002 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chrome\\chromedriver-win64\\chromedriver.exe");
	
		
		
        
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(options);
		
		
		
		
        
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		 options.addArguments("--remote-allow-origins=*");
		
		
		 
		
		
		//1) open url on the browser
		
		driver.get("http://demo.perscholastraining.com/");
		driver.manage().window().maximize();
		
		//delay
		Thread.sleep(5000);
		
		//2)Click on My Account Button from header
		
		driver.findElement(By.xpath("//*[@id=\'menu-item-4100\']/a")).click();
		
		//3)Enter Username
		driver.findElement(By.id("reg_username")).sendKeys("dummy2");
		//4)Enter Email adress
		driver.findElement(By.id("reg_email")).sendKeys("dummy2@gmail.com");
		
		//5Enter Password
		driver.findElement(By.id("reg_password")).sendKeys("pass");
		
		//Click Login
		driver.findElement(By.name("register")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("register")).click();
				
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
