package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class secelecct {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
	WebDriver dv=new ChromeDriver();
	dv.get("https://www.facebook.com/");
	dv.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(6000);
	WebElement sc=dv.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s=new Select(sc);
	boolean y=s.isMultiple();
	s.selectByValue("23");
	
	Thread.sleep(6000);
	WebElement mk=dv.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s1=new Select(mk);
	s1.selectByIndex(5);
	
	Thread.sleep(6000);
	WebElement ml=dv.findElement(By.xpath("//select[@name='birthday_year']"));
	Select s2=new Select(ml);
	s2.selectByVisibleText("1997");
	Thread.sleep(5000);
	WebElement m2=dv.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
	if(m2.isSelected())
	{
		System.out.println("selected");
	}
	else
	{
		m2.click();
	}
	
	
}
}
