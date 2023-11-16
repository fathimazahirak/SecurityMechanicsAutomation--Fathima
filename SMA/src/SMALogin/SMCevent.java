package SMALogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SMCevent {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		      		
		driver.get("https://smc-fe-ms-vmwe4oziqq-el.a.run.app/");
		
		                    
       driver.manage().window().maximize();
       
       WebElement dropdown=driver.findElement(By.xpath("//select[@id='name']"));
       dropdown.click();       
       Thread.sleep(1000);
       
       Select droplogintype=new Select (driver.findElement(By.id("name")));
       droplogintype.selectByVisibleText("Admin");
       Thread.sleep(2000);
       
        
       WebElement emailid= driver.findElement(By.name("username"));
       emailid.sendKeys("fathima.resoluteai@gmail.com");
       Thread.sleep(2000);
       
       WebElement password=driver.findElement(By.name("password"));
       password.sendKeys("OIlGOS4");
       Thread.sleep(2000);
       
       WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
       signin.click();
       Thread.sleep(4000);
       
       WebElement event=driver.findElement(By.xpath("//span[normalize-space()='Event']"));
       event.click();
       Thread.sleep(4000);
       
       WebElement addevent=driver.findElement(By.xpath("//span[contains(@class,'addBtnText')]"));
       addevent.click();
       Thread.sleep(4000);
       
       WebElement eventname=driver.findElement(By.name("name"));
       eventname.sendKeys("Book Fair");
       Thread.sleep(4000);
       
       WebElement lctnname=driver.findElement(By.xpath("//select[@name='location_id']"));
       lctnname.sendKeys("EAMall");
       Thread.sleep(4000);
       
       WebElement startdate=driver.findElement(By.xpath("//input[@name='start_date']"));
       startdate.sendKeys("15.11.2023");
       Thread.sleep(4000);
             
       
       WebElement enddate=driver.findElement(By.name("end_date"));
       enddate.sendKeys("16.11.2023");
       Thread.sleep(4000);
       
       WebElement shifttime=driver.findElement(By.name("shifts[0].start_time"));
       shifttime.sendKeys("17.30");
       Thread.sleep(4000);
       
       WebElement save=driver.findElement(By.xpath("//div[@class='mt-2 row']//div[2]"));
       save.click();
       Thread.sleep(4000);
       
	}

}
