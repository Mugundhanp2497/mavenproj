package seleniumpro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count 
{
	public static void main(String[] args) 
	{
		int count=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.facebook.com/");
		WebElement a=d.findElement(By.xpath("(//a[@role='button'])[2]"));
		a.click();
		List<WebElement> b=d.findElements(By.xpath("//input[@data-type='text']"));
		System.out.println(b.size());
	  List<WebElement> c=d.findElements(By.tagName("select"));
	  System.out.println(c.size());
	  List<WebElement> e=d.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(e.size());
		List<WebElement> f=d.findElements(By.tagName("button"));
		System.out.println(f.size());
		
      List<WebElement> g=d.findElements(By.tagName("iframe"));
      System.out.println(g.size());
	
	  	
	}

}
