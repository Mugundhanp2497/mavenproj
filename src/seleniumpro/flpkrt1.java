package seleniumpro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flpkrt1 {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
	WebDriver dg=new ChromeDriver();
	dg.get("https://www.flipkart.com/");
  //  Alert a=dg.switchTo().alert();
    //a.dismiss();
   // Thread.sleep(8000);
     WebElement ko=dg.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	 Actions an=new Actions(dg);
	 an.moveToElement(ko);
	 an.click();
	dg.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi 8a");
	TakesScreenshot ts=(TakesScreenshot)dg ;
	File sr=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\screenshot");
	FileUtils.copyFile(sr, des);
	
	 
	}

}
