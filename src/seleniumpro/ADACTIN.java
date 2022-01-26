package seleniumpro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ADACTIN 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mugunthan\\eclipse-workspace\\seleniumpro\\driver\\chromedriver.exe");
   WebDriver d=new ChromeDriver();	
   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   d.get("http://adactinhotelapp.com/\r\n");
   d.findElement(By.xpath("//input[@type='text']")).sendKeys("mugundhan");
   d.findElement(By.xpath("//input[@type='password']")).sendKeys("mugu123");
   d.findElement(By.xpath("//input[@type='Submit']")).click();
   
	WebElement a=d.findElement(By.xpath("//select[@name='location']"));
	Select s=new Select(a);
	s.selectByIndex(4);
	
	WebElement b=d.findElement(By.xpath("//select[@name='hotels']"));
	Select s1=new Select(b);
	s1.selectByIndex(3);
	
	WebElement c=d.findElement(By.xpath("//select[@name='room_type']"));
	Select s2=new Select(c);
	s2.selectByIndex(3);
	
	WebElement e=d.findElement(By.xpath("//input[@name='datepick_in']"));
	e.sendKeys("24/07/2022");
	
	d.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("24/08/2022");
	
	WebElement f=d.findElement(By.xpath("//select[@name='adult_room']"));
    Select s3=new Select(f);
    s3.selectByValue("2");
    
    WebElement g=d.findElement(By.xpath("//select[@name='child_room']"));
    Select s4=new Select(g);
    s4.selectByValue("2");
    
    d.findElement(By.xpath("//input[@type='submit']")).click();
   
    WebElement h=d.findElement(By.xpath("//form[@name='select_form']"));
    System.out.println(h.getText());
    List<WebElement> j=h.findElements(By.tagName("tr"));
    System.out.println(j.size());
    d.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
   
    
    for(int i=0;i<j.size();i++)
    {
    WebElement k=j.get(i);
    List<WebElement> l=k.findElements(By.tagName("th"));
    
    for(int w=0;w<l.size();w++)
    {
   
    WebElement m=l.get(w); 
   String n=m.getText();
    System.out.println(n);
   List<WebElement> v=k.findElements(By.xpath("td"));
    for(int y=0;y<v.size();y++)
    {
    	WebElement o=v.get(y);
    	System.out.println(o.getText());
            	
    }
   	}
    }
    d.findElement(By.xpath("//input[@type='submit']")).click();
    d.findElement(By.xpath("//input[@name='first_name']")).sendKeys("mugu");
    d.findElement(By.xpath("//input[@name='last_name']")).sendKeys("perumal");
    d.findElement(By.xpath("//textarea[@name='address']")).sendKeys("sollamudiyathu");
    d.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567889114444");
    WebElement aa=d.findElement(By.xpath("//select[@name='cc_type']"));
    Select a2=new Select(aa);
    a2.selectByVisibleText("American Express");
    WebElement aaa=d.findElement(By.xpath("//select[@name='cc_exp_month']"));
    Select a3=new Select(aaa);
    
    a3.selectByValue("7");
    WebElement aa1=d.findElement(By.xpath("//select[@name='cc_exp_year']"));
    Select a4=new Select(aa1);
    a4.selectByValue("2021");
    d.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("000");
    d.findElement(By.xpath("(//input[@type='button'])[1]")).click();
   WebElement g8= d.findElement(By.xpath("//input[@name='order_no']"));
    System.out.println(g8.getAttribute("value"));  
    
    
    
    }
}
