package test;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4task2 {

		public static void main(String[] args) {
			System.setProperty("webdrive.chrome.driver", "C:\\Driver\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(co);
			driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
			WebElement fname = driver.findElement(By.id("input-firstname"));
			fname.sendKeys("Bhoomika");
			WebElement lname = driver.findElement(By.id("input-lastname"));
			lname.sendKeys("S E");
			WebElement email = driver.findElement(By.id("input-email"));
			email.sendKeys("bhoomika@gmail.com");
			WebElement password = driver.findElement(By.id("input-password"));
			password.sendKeys("Bhoomika");
			WebElement subscribe = driver.findElement(By.id("input-newsletter-yes"));
			subscribe.click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,250)","");
			WebElement check = driver.findElement(By.className("form-check-input"));
			check.click();
		}

}






