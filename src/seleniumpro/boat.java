package seleniumpro;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class boat {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/search?gs_ssp=eJzj4tLP1TfIyLM0syxXYDRgdGDw4ijOSyxISU3MAQBanwcx&q=snapdeal&oq=sn&aqs=chrome.1.69i57j46i199i433i465i512j0i433i512j0i512j0i433i512l2j46i433i512j46i199i433i465i512j0i512.4019j0j7&sourceid=chrome&ie=UTF-8");
		Thread.sleep(7000);
		d.findElement(By.xpath("//span[text()='Snapdeal - Online Shopping - Snapdeal Online Store']")).click();
		WebElement hg=d.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		hg.sendKeys("boat");
		Thread.sleep(6000);
		d.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
		
		String u=d.getWindowHandle();
		
		Set<String> y= d.getWindowHandles();
		//List<String> t=new ArrayList<>();
		//t.addAll(y);
		System.out.println(y);
		for(String g:y)
		{
			if(!g.equals(u))
			{
			d.switchTo().window(g);	
			}
		}
		d.findElement(By.xpath("(//span[@class='intialtext'])[1]")).click();
		d.switchTo().frame("loginIframe");
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("argument[0].setAttribute('values','jaky')",hg);
		js.executeScript("agrument[0].scrollIntoView(true)", hg);
		
		TakesScreenshot ts=(TakesScreenshot)d;
		File dh=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\screenshot");
		FileUtils.copyFile(dh, f);
		
		
	}

}
