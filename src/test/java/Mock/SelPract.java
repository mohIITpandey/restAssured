package Mock;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelPract {
public static void main(String[] args) throws InterruptedException, AWTException, EncryptedDocumentException, IOException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPhone 13");
    driver.findElement(By.id("nav-search-submit-button")).click();
   List<WebElement> names = driver.findElements(By.xpath("//a//span[contains(.,'Apple iPhone 13 Mini (')]"));
   List<WebElement> prices = driver.findElements(By.xpath("//a//span[contains(.,'Apple iPhone 13 Mini (')]/ancestor::div[contains(@class,'s-title-instructions-style')]/following-sibling::div[@class='sg-row']//span[@class='a-price-whole']"));
FileInputStream fis=new FileInputStream("./src/test/resources/ForAmazon.xlsx");
Workbook wb=WorkbookFactory.create(fis);
for(int i=0;i<names.size();i++) {
	String name = names.get(i).getText();
	String price = prices.get(i).getText();
	wb.getSheet("Sheet1").createRow(i).createCell(0).setCellValue(name);
	wb.getSheet("Sheet1").getRow(i).createCell(1).setCellValue(price);
}
FileOutputStream fos1=new FileOutputStream("./src/test/resources/ForAmazon.xlsx");
wb.write(fos1);
wb.close();

}
}
