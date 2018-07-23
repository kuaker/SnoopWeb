package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.AbstractPageObject;

public class Contacto extends AbstractPageObject{

	public Contacto(WebDriver driver, WebDriverWait driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}
	
	public void CompleteForm() {
		WebElement name = driver.findElement(By.name("nombre"));
		WebElement surname = driver.findElement(By.name("apellido"));
		WebElement company = driver.findElement(By.name("empresa"));
		WebElement position = driver.findElement(By.name("cargo"));
		WebElement email = driver.findElement(By.name("your-email"));
		WebElement message = driver.findElement(By.name("your-message"));
		
		name.sendKeys("Fernando");
		surname.sendKeys("Arroupe");
		company.sendKeys("Snoop");
		position.sendKeys("qa");
		email.sendKeys("fernando.arroupe@snoopconsulting.com");
		message.sendKeys("¿ ");
		
	}
	
}
