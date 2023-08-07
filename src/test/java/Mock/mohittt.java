package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class mohittt {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	options.addArguments("--incognito");
	options.addArguments("--start-maximized");
	//options.addArguments("disable-popup-blocking");
	options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"}); 
	WebDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebDriver driver= new ChromeDriver();
	driver.get("https://google.com/");
	driver.findElement(By.xpath("//button[.='Test my mic']")).click();
	System.out.println("mohit");
}
}
