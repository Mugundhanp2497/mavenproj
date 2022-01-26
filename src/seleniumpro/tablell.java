package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablell {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement jj=d.findElement(By.xpath("(//div[@class='w3-example'])[1]"));
		WebElement jk=jj.findElement(By.tagName("tr"));
		System.out.println(jk.getText());
		
		
	}

}
