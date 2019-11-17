package WTW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register 
{
	
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		// Setting of Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\MySoftwares\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Passing the url
		driver.get("http://newtours.demoaut.com");
		
		//Clicking on Register tab on page
		WebElement reg_tab = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		reg_tab.click();
		
		//Entering the Details
		WebElement fst_name = driver.findElement(By.name("firstName"));
		fst_name.sendKeys("A");
		
		WebElement last_name = driver.findElement(By.name("lastName"));
		last_name.sendKeys("B");
		
		WebElement phone_no = driver.findElement(By.name("phone"));
		
		phone_no.sendKeys("8745784578");
		
		WebElement emailid = driver.findElement(By.name("userName"));
		emailid.sendKeys("a@gmail.com");
		
		WebElement addr = driver.findElement(By.name("address1"));
		addr.sendKeys("ABC");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Mumbai");
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Maharashra");
		
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("784578");
		
		WebElement country = driver.findElement(By.name("country"));
		country.sendKeys("India");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("ABC");
		
		WebElement pswd = driver.findElement(By.name("password"));
		pswd.sendKeys("ABC");
		
		WebElement cnfn_pswd = driver.findElement(By.name("confirmPassword"));
		cnfn_pswd.sendKeys("ABC");
		
		WebElement register = driver.findElement(By.name("register"));
		register.click();
	}

}
