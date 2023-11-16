package SMALogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SMClogin {

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
       
     //  WebElement refresh=driver.findElement(By.xpath("//span[contains(text(),'REFRESH')]"));
     //  refresh.click();
    //   Thread.sleep(2000);
       
       WebElement location=driver.findElement(By.xpath("//span[contains(text(),'Location')]"));
       location.click();
       Thread.sleep(4000);
       
       WebElement addlocation=driver.findElement(By.xpath("//span[@class='addBtnText']"));
       addlocation.click();
       Thread.sleep(4000);
       
       
       WebElement searchlctn=driver.findElement(By.xpath("//input[@id='placeSearchField']"));
       searchlctn.sendKeys("EAMall,Chennai");
       searchlctn.click();
       Thread.sleep(4000);
       
       WebElement lctnname=driver.findElement(By.name("location_name"));    
       lctnname.sendKeys("EAMall,Chennai");
       Thread.sleep(4000);
       
       WebElement add1=driver.findElement(By.name("address1"));
       add1.sendKeys("Chennai");
       Thread.sleep(4000);
       
       WebElement security=driver.findElement(By.name("no_of_security_personnel"));
       security.sendKeys("3");
       Thread.sleep(4000);
       
       WebElement cameras=driver.findElement(By.name("no_of_cameras"));
       cameras.sendKeys("5");
       Thread.sleep(4000);
       
       WebElement submit=driver.findElement(By.xpath("//span[normalize-space()='Submit']"));
       submit.click();
       Thread.sleep(4000);

	}

}
