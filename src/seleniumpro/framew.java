package seleniumpro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framew {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
         WebDriver d=new ChromeDriver();
         d.get("http://demo.guru99.com/test/guru99home/");
         String gh=d.getWindowHandle();
        WebElement mk= d.findElement(By.xpath("//iframe[@wmode='transparent']"));
        mk.click();
         d.switchTo().frame(mk);
         d.findElement(By.xpath("//button[@class='ytp-button ytp-settings-button']")).click();
         Thread.sleep(7000);
         d.switchTo().parentFrame();
         d.switchTo().frame("a077aa5e");
         d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
         Thread.sleep(7000);
         d.switchTo().defaultContent();
         
         
          Set <String> ml=d.getWindowHandles();
          List<String> l=new LinkedList<>();
          l.addAll(ml);
          for(String ko:l)
          {
        	if(!ko.equals(gh))
        	{
        		d.switchTo().window(gh);
        	}
          }
         
         
         
	}

}
