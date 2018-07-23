package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.AbstractPageObject;

public class HomePage extends AbstractPageObject{

	public HomePage(WebDriver driver, WebDriverWait driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}
	
	
	public void EnterServicios() throws InterruptedException {
		driver.findElement(By.id("menu-item-67514")).click();
		TimeUnit.SECONDS.sleep(26);
		driver.close();
	}
	
	public void EnterClientes() throws InterruptedException {
		driver.findElement(By.id("menu-item-47721")).click();
		TimeUnit.SECONDS.sleep(26);
	}
	
	public void EnterPartners() throws InterruptedException {
		driver.findElement(By.id("menu-item-41501")).click();
		TimeUnit.SECONDS.sleep(26);
	}
	
	public void EnterSumate() throws InterruptedException {
		driver.findElement(By.id("menu-item-47741")).click();
		TimeUnit.SECONDS.sleep(26);
	}
	
	public void EnterPymes() throws InterruptedException {
		driver.findElement(By.id("menu-item-76434")).click();
		TimeUnit.SECONDS.sleep(26);
	}
	
		
	
	public void ReadSpan() {
		WebElement txt = driver.findElement(By.xpath("//*[@id=\"fancy-title-4\"]/span"));
		txt.getText();
		System.out.println("HOLA a TODOS");
		System.out.println(txt);
	}
	
	public void SpeakWithConsultant() {
		driver.findElement(By.xpath("//*[@id=\"mk-button-6\"]/a")).click();
	}
	

}
