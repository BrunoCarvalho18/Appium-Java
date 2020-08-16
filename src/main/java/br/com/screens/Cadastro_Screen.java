package br.com.screens;

import java.net.MalformedURLException;
import io.appium.java_client.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.devcapp.App;
import cucumber.api.junit.Cucumber;

public class Cadastro_Screen {

	App auxDriver = new App();
	WebDriver driver = auxDriver.conex();
	WebDriverWait espera = auxDriver.esperar(driver);

	public void telaPrincipalAberta() throws MalformedURLException {

		WebElement elementotelahome = driver.findElement(By.id("imageView2"));
		elementotelahome.isEnabled();

	}

	public void preenchercampos() throws MalformedURLException {
		

		DesiredCapabilities capacidade = new DesiredCapabilities();
		capacidade.setCapability("unicodeKeyboard", true);
		capacidade.setCapability("resetKeyboard", true);
		
        WebElement criarConta = driver.findElement(By.id("link_signup"));
		criarConta.click();
		
		WebElement campoPreencherNome = driver.findElement(By.id("input_name"));
		campoPreencherNome.sendKeys("Teste");
		
		WebElement campoPreencherCpf = driver.findElement(By.id("input_cpf"));
		campoPreencherCpf.sendKeys("85567119012");
		
		WebElement campoPreencherSenha = driver.findElement(By.id("input_password"));
		campoPreencherSenha.sendKeys("85567119");
		
		WebElement clicarBotaoCriarConta = driver.findElement(By.id("btn_signup"));
		clicarBotaoCriarConta .click();
	
        
	}
}