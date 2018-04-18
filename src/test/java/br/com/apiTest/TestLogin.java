package br.com.apiTest;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class TestLogin extends TestCase {
	static WebDriver driver;
	private static final String username = "admin";
	private static final String password = "admin";

	public TestLogin() {

	}

	@Before
	public static void setUpClass() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" http://desafioqa.marketpay.com.br:9087/desafioqa/login");
	}

	@Test
	public void testeUsuarioIncorreto() {
		driver = new ChromeDriver();
		driver.get("http://desafioqa.marketpay.com.br:9087/desafioqa/login");

		WebElement inputName = driver.findElement(By.name("username"));
		inputName.sendKeys("Admin");
		WebElement inputPassword = driver.findElement(By.name("password"));
		inputPassword.sendKeys("admin");
		
		if (inputName.getText() != username) {
			System.out.println("erro de credenciais, usuario incorreto");
		}
		//inputName.submit();
		//inputPassword.submit();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		
		
		
	}
	
	@Test
	public void testeUsuarioCorreto() {
		driver = new ChromeDriver();
		driver.get("http://desafioqa.marketpay.com.br:9087/desafioqa/login");

		WebElement inputName = driver.findElement(By.name("username"));
		inputName.sendKeys("admin");
		WebElement inputPassword = driver.findElement(By.name("password"));
		inputPassword.sendKeys("admin");

		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	
	}
	
	@Test
	public void testSenhaIncorreta() {
		driver = new ChromeDriver();
		driver.get("http://desafioqa.marketpay.com.br:9087/desafioqa/login");
		
		WebElement inputName = driver.findElement(By.name("username"));
		inputName.sendKeys("admin");
		WebElement inputPassword = driver.findElement(By.name("password"));
		inputPassword.sendKeys("Admin");

		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		
	
	}
	
	@Test
	public void testeSenhaCorreta() {
		driver = new ChromeDriver();
		driver.get("http://desafioqa.marketpay.com.br:9087/desafioqa/login");

		WebElement inputName = driver.findElement(By.name("username"));
		inputName.sendKeys("admin");
		WebElement inputPassword = driver.findElement(By.name("password"));
		inputPassword.sendKeys("admin");
		
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		
		//Select selectUF = new Select(driver.findElement(By.name("UF")));
		// selectUF.selectByVisibleText("RJ");
		
	
	}
	@After
	public static void testDownAfterClass() throws Exception {
		
	}
}
