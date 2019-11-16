package WTW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login 
{
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftwares\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//https://www.facebook.com/
			
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"u_0_m\"]"));
		firstname.sendKeys("Harshada");
			
		driver.findElement(By.xpath("//div[@id='u_0_n']/div/input")).sendKeys("Tendulkar");;
			
		WebElement emailid = driver.findElement(By.name("reg_email__"));
		emailid.sendKeys("aaron.maven@gmail.com");
			
		WebElement reemailid = driver.findElement(By.name("reg_email_confirmation__"));
		reemailid.sendKeys("aaron.maven@gmail.com");
			
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("Welcome123");
			
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Dec");
			
		Select Date = new Select(driver.findElement(By.id("day")));
		Date.selectByVisibleText("3");
			
		Select Year = new Select(driver.findElement(By.id("year")));
		Year.selectByVisibleText("1994");
		
		//Radio button check 
			/*This is just a demo code how you can 
			 *parse through all radio buttons and select any specific radio btn depending on its value.
			*/
			List<WebElement> radiobtns = driver.findElements(By.xpath("//*[@type='radio']"));
			for(WebElement x:radiobtns)
			{
				String name = x.getAttribute("value");
				if(name.equalsIgnoreCase("1"))
				{
					x.click();
					break;
				}
								
			}
			
			Thread.sleep(5000);
		WebElement Signup_Btn = driver.findElement(By.name("websubmit"));
		Signup_Btn.click();
		
	}

}
