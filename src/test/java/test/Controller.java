package test;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class Controller {
	
	@Test
	public void cEnterServicio() throws InterruptedException {
		LoginTest snoop = new LoginTest();
		snoop.LTEnterServicios();
	}
	
	public void cReadSpan() {
		LoginTest snoop = new LoginTest();
		snoop.LTReadSpan();
	}
	
	
	public void cCompleteForm() {
		LoginTest snoop = new LoginTest();
		snoop.LTSpeakWithConsultant();
		snoop.LTCompleteForm();
	}
	
}
