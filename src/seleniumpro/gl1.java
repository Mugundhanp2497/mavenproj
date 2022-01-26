package seleniumpro;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class gl1 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://google.com");
	WebElement y=dr.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	y.sendKeys("greens velmurugan");

	//dr.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	dr.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
	Thread.sleep(8000);
	//System.out.println(y.getAttribute("value"));
	
	//Actions a=new Actions(dr);
	//a.moveToElement(y).perform();
	//a.keyDown(Keys.ENTER).perform();
	//a.keyUp(Keys.ENTER).perform();
	TakesScreenshot tk=(TakesScreenshot)dr;
	File sr=tk.getScreenshotAs(OutputType.FILE  );
	File fs=new File("C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\screenshot\\mugu.png");
	FileUtils.copyFile(sr, fs);
	dr.close();


}
}