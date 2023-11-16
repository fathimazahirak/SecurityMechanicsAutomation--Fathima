package SMALogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SMAlocation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
						
		driver.get("https://sma-fe-ms-vmwe4oziqq-el.a.run.app/");
		driver.manage().window().maximize();
                            	
    	 WebElement emailid1= driver.findElement(By.name("username"));
         emailid1.sendKeys("bhuvanesh.resoluteai@gmail.com");
         Thread.sleep(1000);      
         
         WebElement password1=driver.findElement(By.name("password"));
         password1.sendKeys("bhuvan@123");
         Thread.sleep(1000);
         
         WebElement signin1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div[2]/div[2]"));
         signin1.click();
         Thread.sleep(4000);
         
         WebElement location=driver.findElement(By.xpath("//span[normalize-space()='Location Requests']"));
         location.click();
         Thread.sleep(3000);
         
         WebElement search=driver.findElement(By.className("form-control"));
         search.sendKeys("DG");
         Thread.sleep(2000);
         
        /* WebElement view=driver.findElement(By.xpath("//button[normalize-space()='View']"));
         view.click();
         Thread.sleep(2000);
         
         WebElement viewclose=driver.findElement(By.xpath("//div[contains(@class,'modal-header')]//button[contains(@aria-label,'Close')]"));
         viewclose.click();
         Thread.sleep(2000);*/
         
         WebElement appsett=driver.findElement(By.xpath("//span[normalize-space()='App Settings']"));
         appsett.click();
         Thread.sleep(2000);
         
         WebElement crntpswd=driver.findElement(By.xpath("//input[contains(@placeholder,'Current Password')]"));
         crntpswd.sendKeys("bhuvan@123");
         Thread.sleep(2000);
         
         WebElement newpswd=driver.findElement(By.xpath("//input[@placeholder='New Password']"));
         newpswd.sendKeys("fathima");
         Thread.sleep(2000);
         
         WebElement retypepswd=driver.findElement(By.xpath("//input[@placeholder='Re-Type New Password']"));
         retypepswd.sendKeys("fathima");
         Thread.sleep(2000);
         
         WebElement clear=driver.findElement(By.xpath("//span[normalize-space()='Clear']"));
         clear.click();
         Thread.sleep(4000); 
         
         driver.quit();

	}

}
