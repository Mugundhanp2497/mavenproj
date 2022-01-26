package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver(); 
		d.get(" https://www.redbus.in/");
		String title1=d.getTitle();
		String cturl=d.getCurrentUrl();
		System.out.println(title1);
		System.out.println(cturl);
		WebElement dk=d.findElement(By.xpath("//input[@tabindex='1']"));
		dk.sendKeys("chennai");
		WebElement dj=d.findElement(By.xpath("//input[@tabindex='2']"));
		dj.sendKeys("neyveli");
		WebElement df=d.findElement(By.xpath("//input[@readonly='readonly']"));
		df.click();
	    WebElement ds=d.findElement(By.xpath("//button[@class='f1 button']"));
	    ds.click();
	    
		
		
		
	}

}
