package br.com.apiTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCadastroCliente {
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.get("http://desafioqa.marketpay.com.br:9087/desafioqa/inicio");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		 driver.close();
	}
	

	@Test
	public void testCpfInvalido() {
		 driver.findElement(By.id("botaoSalvar")).click();
		WebElement inputName = driver.findElement(By.name("nome"));
		inputName.sendKeys("edmar");
		WebElement inputCpf = driver.findElement(By.name("cpf"));
		inputCpf.sendKeys("usando texto");
		WebElement inputSaldoCliente = driver.findElement(By.name("saldoCliente"));
		inputSaldoCliente.sendKeys("444.00");
		
	    driver.findElement(By.id("botaoSalvar")).click();
	  
		
	}

}
