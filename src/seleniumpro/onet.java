 package seleniumpro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class onet {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver r=new ChromeDriver();
		r.manage().window().maximize();
		r.get("https://www.facebook.com/");
		String a=r.getTitle();
		String b=r.getCurrentUrl();
		System.out.println(a);
		System.out.println(b);
		WebElement d=r.findElement(By.id("email"));
		d.sendKeys("mugu22@gmail.com");
		WebElement di=r.findElement(By.name("pass"));
       // di.sendKeys("1234567890");
        WebElement de=r.findElement(By.xpath("//button[@type='submit']"));
       // de.click();
       WebElement hj= r.findElement(By.xpath("//h2[contains(text(),'connect')]"));
       
       JavascriptExecutor js=(JavascriptExecutor)r;
        js.executeScript("arguments[0].scrollIntoView(true)", de);
        
        js.executeScript("arguments[0].setAttribute('value','mugu')", di);
        Object o=js.executeScript("return arguments[0].getAttribute('value')", di); 
        System.out.println(o);
        
      TakesScreenshot ts=(TakesScreenshot)r;
       File po= ts.getScreenshotAs(OutputType.FILE);
       File f=new File("C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\screenshot\\kk.png");
       FileUtils.copyFile(po, f);
        
		//r.close();
		//r.quit();
		

}
}
