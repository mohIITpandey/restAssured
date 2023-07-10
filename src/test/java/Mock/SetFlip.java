package Mock;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetFlip {
	public static void main(String[] args) throws InterruptedException, AWTException, EncryptedDocumentException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[(not(contains(.,'Request OTP')))and(contains(@class,'KpZ'))]")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung s");
	}
}
