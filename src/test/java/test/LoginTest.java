package test;




import java.io.IOException;

import org.apache.xalan.xsltc.compiler.Template;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import pageFactory.AbstractPageObject;
import pages.Contacto;
import pages.HomePage;


public class LoginTest extends BaseTest {
	
	//CONSTRUCTOR
	
	public LoginTest() {
		super.setup();
		}	
	
	
	public void LTEnterServicios() throws InterruptedException {
		HomePage homepage = new HomePage(driver, driverWait);
		homepage.EnterServicios();
	}
	
	
	public void LTReadSpan() {
		HomePage homepage = new HomePage(driver, driverWait);
		homepage.ReadSpan();
	}
	
	public void LTSpeakWithConsultant() {
		HomePage homepage = new HomePage(driver, driverWait);
		homepage.SpeakWithConsultant();
	}
	
	public void LTCompleteForm() {
		Contacto contacto = new Contacto(driver, driverWait);
		contacto.CompleteForm();
	}

}